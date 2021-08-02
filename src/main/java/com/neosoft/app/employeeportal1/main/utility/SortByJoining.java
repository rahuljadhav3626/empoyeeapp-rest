package com.neosoft.app.employeeportal1.main.utility;

import java.util.Comparator;

import com.neosoft.app.employeeportal1.main.entity.Employee;

public class SortByJoining implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getDateOfJoining().compareTo(o2.getDateOfJoining());
	}

}
