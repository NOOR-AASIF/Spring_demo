package com.example.SecondSpringBootProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public VegPizza vegPizza()
	{
		return new VegPizza();
	}
	
	@Bean
	public NonVegPizza nonVegPizza()
	{
		return new NonVegPizza();
	}
	
	@Bean
	public Burger burger()
	{
		return new Burger();
	}
	
	
	
	public void hel()
	{
		System.out.println("hefwejhdvjafc");
	}

}
