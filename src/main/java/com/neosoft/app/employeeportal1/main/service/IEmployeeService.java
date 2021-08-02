package com.neosoft.app.employeeportal1.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.neosoft.app.employeeportal1.main.dto.Response;
import com.neosoft.app.employeeportal1.main.entity.Employee;
@Service
public interface IEmployeeService {

	public Employee createEmployee(Employee employee) ;

	public List <Employee> getEmployeeByName();

	public Response deleteEmployee(Short id);

	public Employee updateEmployee(Employee employee);
	
	public Employee getEmployee(short id);

	public Employee findByIdForSoftDelete(short id);
}
