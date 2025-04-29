package org.ObjectDependcy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainData {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigData.class);
		
		 Company com = (Company)context.getBean("c");
		 
		 com.show();
	}
	
	

}
