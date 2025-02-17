package com.example.SecondSpringBootProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Buyer {
	
	@Autowired
	@Qualifier("BurgerKar")
	private Shop shop;
	
	
	
	public void buyers()
	{
		System.out.println("This is a Buyers method");
		shop.getPizza();
	}

}
