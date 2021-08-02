package com.neosoft.app.employeeportal1.main.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
//import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import com.neosoft.app.employeeportal1.main.dto.Response;
import com.neosoft.app.employeeportal1.main.entity.Employee;
import com.neosoft.app.employeeportal1.main.exceptionhandling.EmployeeNotFoundException;
import com.neosoft.app.employeeportal1.main.repository.IEmployeeRepository;
import com.neosoft.app.employeeportal1.main.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeRepository employeeRepository;

	@Autowired
	private EntityManager entityManager;

	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getEmployeeByName() {
		Order order = new Order(Direction.ASC, "dateOfJoining");
		return (List<Employee>) employeeRepository.findAll(Sort.by(order));

	}

	public Employee getEmployee(short id) {
		/*
		 * Session session = entityManager.unwrap(Session.class); Filter filter =
		 * session.enableFilter("deletedProductFilter");
		 * filter.setParameter("isDeleted", isDeleted); Employee employee =
		 * employeeRepository.save(null); session.disableFilter("deletedProductFilter");
		 */
		// return employeeRepository.findById(id);
		//boolean isActive = false ;
		Optional<Employee> optional = employeeRepository.findById(id);
		Employee employee = optional.orElseThrow(()-> new EmployeeNotFoundException("no id"));
		//employee.isActive();
	    Employee emp =employeeRepository.save(employee);
		return emp ;
	}

		/*if(employee == null) {
			throw new EmployeeNotFoundException("No id Is Found");
		} else {
			return employee ;
		}
		
	}*/

	@Override
	public Response deleteEmployee(Short id) {
	employeeRepository.deleteById(id);
	Response resp = new Response();
	resp.setMsg("removed id is " + id);
		return resp;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee em = employeeRepository.save(employee);
		return em ;
	}


	public Employee findByIdForSoftDelete(short id) {
		
		Optional<Employee> employee = employeeRepository.findById(id);
		System.out.println(employee);
		Employee emp =employee.get();
		System.out.println(emp);
		//emp.setActive(false);
	 Employee e =employeeRepository.save(emp);
	 return e ;
		
	}
}

