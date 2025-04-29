package LifyCycleProgramming;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

public class Employee implements InitializingBean , DisposableBean {
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
	
    
	public void userinit() {
		System.out.println("init method");
	}

	public void show() {
		System.out.println("user custom method called");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method called");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method called");
		
	}
	
	
	
	
	

}
