package com.neosoft.app.employeeportal1.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.app.employeeportal1.main.entity.Employee;
@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Short>{

	Employee findByFirstName(String name);

	void save(short id);

}
