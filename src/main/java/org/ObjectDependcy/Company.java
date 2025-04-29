package org.ObjectDependcy;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {
	@Autowired
	Employee employee;
	
	public void show() {
		System.out.println("id is " +  employee.getId() + " " + "name is " +  employee.getName() + " " + "salary is " + employee.getSalary());
	}

}
