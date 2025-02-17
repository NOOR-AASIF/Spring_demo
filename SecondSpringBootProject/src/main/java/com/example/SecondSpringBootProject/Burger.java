package com.example.SecondSpringBootProject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("BurgerKar")
@Component
public class Burger implements Shop {

	@Override
	public void getPizza() {
		System.out.println("This is Burger");
		
	}

}
