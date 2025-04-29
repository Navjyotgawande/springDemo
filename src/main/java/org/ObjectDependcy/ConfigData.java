package org.ObjectDependcy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigData {
	@Bean("e")
	public Employee getEmployee() {
		return new Employee();
	}
	@Bean("c")
	public Company getCompany() {
		return new Company();	}

}
