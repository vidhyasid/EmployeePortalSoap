package com.v2soft.training.service;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.v2soft.training.dao.EmployeeDao;
import com.v2soft.training.server.EmployeeWithSalary;
import com.v2soft.training.server.GetEmployeeRequestWithSecurity;
import com.v2soft.training.server.UpdateEmployeeSalaryRequestWithSecurity;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	 @Transactional
	 public EmployeeWithSalary updateEmployee (UpdateEmployeeSalaryRequestWithSecurity in) {
		 return employeeDao.updateEmployee(in);
	 }
	 
	 @Transactional
	 public EmployeeWithSalary getEmployee(GetEmployeeRequestWithSecurity in) {
		 return employeeDao.getEmployee(in);
	 }
}
