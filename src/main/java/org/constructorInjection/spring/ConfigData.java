package org.constructorInjection.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigData {
	@Bean("s")
	public Student getStudent(@Value("101") int sid, @Value("Shyam") String sName , @Value("90") int marks) {
		 return new Student(sid , sName , marks);
	 }

}
