package ScopeOfClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainData {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigData.class);
		
		Test t1 = (Test)context.getBean("test");
		Test t2 = (Test)context.getBean("test");
		Test t3 = (Test)context.getBean("test");
		Test t4 = (Test)context.getBean("test");
	}

}
