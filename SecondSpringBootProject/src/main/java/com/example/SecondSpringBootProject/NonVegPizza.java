package com.example.SecondSpringBootProject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("NonVeg")
@Component
public class NonVegPizza implements Shop{

	
	public void getPizza() 
	{
		System.out.println("This is a Non Veg Pizza");
		
	}
	
	

}
