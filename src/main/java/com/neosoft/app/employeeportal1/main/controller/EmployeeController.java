package com.neosoft.app.employeeportal1.main.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.app.employeeportal1.main.dto.Response;
import com.neosoft.app.employeeportal1.main.entity.Employee;
import com.neosoft.app.employeeportal1.main.service.IEmployeeService;

@RestController
@CrossOrigin(origins = "*")
//@RequestMapping("/api/v1")
public class EmployeeController {

	@Autowired
	IEmployeeService employeeService;

	@RequestMapping(value = "/employees/save", method = RequestMethod.POST, consumes = {"application/json"})
	public Employee createEmployee(@Valid @RequestBody  Employee employee) {
		return employeeService.createEmployee(employee);
	}

	@RequestMapping(value = "/employees/getEmployeeByName", method = RequestMethod.GET, produces = {"application/json"})
	public List<Employee> getEmployeeByName() {
		return employeeService.getEmployeeByName();
	}

	@RequestMapping(value = "/employees/deleteByIdEmployee/{id}", method = RequestMethod.DELETE)
	public Response deleteEmployee(@PathVariable Short id) {
		return employeeService.deleteEmployee(id);
	}

	@RequestMapping(value = "/employees/findById/{id}", method = RequestMethod.GET, consumes = {"application/json"})
	public Employee getEmployee(@PathVariable short id) {
		return employeeService.getEmployee(id);
	}

	@RequestMapping(value = "/employees/updateEmployee", method = RequestMethod.PUT, consumes = {"application/json"})
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@RequestMapping(value = "/employees/findByIdForSoftDelete/{id}", method = RequestMethod.DELETE, consumes = { "application/json"})
	  public Employee findByIdForSoftDelete(short id) { return
	  employeeService.findByIdForSoftDelete(id);
	  
	  }
	 }
