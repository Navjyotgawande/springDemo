package org.constructorInjection.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainMethod {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(ConfigData.class);
		
		Student st = (Student)con.getBean("s");
		   System.out.println(st);
	}
	
	

}
