package ScopeOfClass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigData {
	
	@Bean("test")
//	@Scope(value = "singleton")
	@Scope(value = "prototype")
	public Test getTest() {
		return new Test();
	}

}
