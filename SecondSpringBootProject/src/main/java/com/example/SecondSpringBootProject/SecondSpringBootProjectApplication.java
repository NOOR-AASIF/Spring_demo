package com.example.SecondSpringBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SecondSpringBootProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(SecondSpringBootProjectApplication.class, args);
//		Internet it=con.getBean(Internet.class);
//		it.connection();
//		
	
//	Buyer b=con.getBean(Buyer.class);
//	b.buyers();
		
		con.getBean(Config.class).hel();;
	}

}
