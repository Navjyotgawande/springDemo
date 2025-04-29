package LifyCycleProgramming;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigData {
	@Bean("emp")
	public Employee getEmployee() {
		return new Employee();
	}

}
