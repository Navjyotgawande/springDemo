package org.injection.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(ConfigData.class);
		Employee emp = (Employee)con.getBean("m");
		System.out.print(emp.toString());
	}

}
