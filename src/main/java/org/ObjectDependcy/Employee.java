package org.ObjectDependcy;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	@Value("101")
	private int id;
	@Value("Vivek")
	private String name;
	@Value("6000")
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
