package com.example.SecondSpringBootProject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class VegPizza implements Shop{
	
	public void getPizza()
	{
		System.out.println("This is a Veg Pizza");
	}

}
