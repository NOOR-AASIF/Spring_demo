package com.example.SecondSpringBootProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Internet 
{
	//field Injection
	@Autowired
	private Airtel airtel;
	

	
	public void connection()
	{
		System.out.println("This is a Connection");
		airtel.airtelConnection();
	}

}
