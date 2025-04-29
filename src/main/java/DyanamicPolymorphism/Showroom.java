package DyanamicPolymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Showroom {
	@Autowired
	@Qualifier("bike")
	Vehicle v;
	
	public void Show() {
		v.Engine();
	}

}
