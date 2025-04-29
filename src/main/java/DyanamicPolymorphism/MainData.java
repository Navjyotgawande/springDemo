package DyanamicPolymorphism;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainData {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigData.class);
		
		Showroom s = (Showroom)context.getBean("showroom");
		s.Show();
	}

}
