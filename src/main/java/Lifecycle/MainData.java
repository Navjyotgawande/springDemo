package Lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainData {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigData.class);
		Employee emp = (Employee)context.getBean("emp");
		
		emp.show();
		context.close();   // used to close the destroy the destroy method.
	}

}
