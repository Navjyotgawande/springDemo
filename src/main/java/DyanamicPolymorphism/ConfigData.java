package DyanamicPolymorphism;

import org.springframework.context.annotation.Bean;

public class ConfigData {

	@Bean("bike")
	public Bike getBike() {
		return new Bike();
	}
	@Bean("car")
	public Car getCar() {
		return new Car();
	}
	@Bean("showroom")
	public Showroom getData() {
		return new Showroom();
	}
	
	

}
