package com.v2soft.training.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.v2soft.training.model.Employeeinfo;
import com.v2soft.training.model.Salaryinfo;
import com.v2soft.training.server.EmployeeWithSalary;
import com.v2soft.training.server.GetEmployeeRequestWithSecurity;
import com.v2soft.training.server.SalaryDetails;
import com.v2soft.training.server.UpdateEmployeeSalaryRequestWithSecurity;


public class EmployeeDao {
	
private SessionFactory sessionFactory;
	@Autowired
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
public EmployeeWithSalary updateEmployee (UpdateEmployeeSalaryRequestWithSecurity in){
		
		Session session = sessionFactory.getCurrentSession();
		String empid = in.getEmployeeWithSalary().getEmployeeId();
		String basicpay = in.getEmployeeWithSalary().getEmployeeSalaryDetails().getBasicPay();
		String hra = in.getEmployeeWithSalary().getEmployeeSalaryDetails().getHRA();
		String mAllowance = in.getEmployeeWithSalary().getEmployeeSalaryDetails().getMedicalAllowance();
		String tAllowance = in.getEmployeeWithSalary().getEmployeeSalaryDetails().getTravelAllowance();
		
		Query<Salaryinfo> query = session.createQuery("update Salaryinfo set basicpay = '" +basicpay+"',"+
										   "hra = '"+hra+"',"+"travelAllowance = '"+tAllowance+"',"+
										   "medicalAllowance = '"+mAllowance+"'"+
										   " where employeeId = '"+empid+"'");
		query.executeUpdate();
		return getEmployeeWithId(empid);		
	}

    public EmployeeWithSalary getEmployee(GetEmployeeRequestWithSecurity in){
    	
    	String empid = in.getEmployeeId();
    	return getEmployeeWithId(empid);
	}
    
    public EmployeeWithSalary getEmployeeWithId(String empid) {
		
    	Session session = sessionFactory.getCurrentSession();
		EmployeeWithSalary employee = new EmployeeWithSalary();
    	SalaryDetails salary = new SalaryDetails();
    	
    	Query<Salaryinfo> subquery = session.createQuery("from Salaryinfo where employeeId = '"+empid+"'");
    	Salaryinfo salaryinfo = subquery.getSingleResult();

        salary.setBasicPay(salaryinfo.getBasicPay());
        salary.setHRA(salaryinfo.getHra());
        salary.setMedicalAllowance(salaryinfo.getMedicalAllowance());
        salary.setTravelAllowance(salaryinfo.getTravelAllowance());
    	 
        Query<Employeeinfo> query = session.createQuery("from Employeeinfo where employeeId = '"+empid+"'");
        Employeeinfo employeeinfo = query.getSingleResult();
      
        employee.setEmployeeId(employeeinfo.getEmployeeId());
        employee.setFirstName(employeeinfo.getFirstName());
        employee.setLastName(employeeinfo.getLastName());
        employee.setDateOfBirth(employeeinfo.getDateOfBirth().toString());
        employee.setEmployeeSalaryDetails(salary);
    	        
		return employee;
	}
}
