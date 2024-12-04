package Chipl.Eclipsespring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configur {
	@Bean
	public  School m1() {
		School sch=new School(1,"vamsi",100);
		return sch;
	}
}
