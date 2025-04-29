package Lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	@Value("101")
	private int id;
	@Value("Shyam")
	private String name;
	@Value("5000")
	private int Salary;
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
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	@PostConstruct
	public void userinit() {
		System.out.println("init method");
	}
	
	@PreDestroy
	public void userDestroy() {
		System.out.println("Destroy method");
	}
	
	public void show() {
		System.out.println("user custom method");
	}
	
	
	
	
	

}
