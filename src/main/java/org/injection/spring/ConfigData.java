package org.injection.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigData {
     @Bean("m")
	 public Employee geEmployee() {
		 return new Employee();
	 }
	 
}
