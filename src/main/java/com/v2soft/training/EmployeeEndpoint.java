package com.v2soft.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.v2soft.training.server.EmployeeWithSalary;
import com.v2soft.training.server.GetEmployeeRequestWithSecurity;
import com.v2soft.training.server.UpdateEmployeeSalaryRequestWithSecurity;
import com.v2soft.training.service.EmployeeService;

@Endpoint
public class EmployeeEndpoint {

	private static final String NAMESPACE_URI = "http://localhost:8080/types";
	
	private EmployeeService employeeService;
	 
    @Autowired
    public EmployeeEndpoint(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
	 
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdateEmployeeSalaryRequest")
    @ResponsePayload
    public EmployeeWithSalary updateSalary(@RequestPayload UpdateEmployeeSalaryRequestWithSecurity request) {
		EmployeeWithSalary response = employeeService.updateEmployee(request);
        return response;		
    }
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetEmployeeRequest")
    @ResponsePayload
    public EmployeeWithSalary getEmployee(@RequestPayload GetEmployeeRequestWithSecurity request) {
		EmployeeWithSalary response = employeeService.getEmployee(request);		
        return response;
    }
}
