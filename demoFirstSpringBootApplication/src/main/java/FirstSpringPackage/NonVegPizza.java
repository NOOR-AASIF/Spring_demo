package FirstSpringPackage;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class NonVegPizza implements Shop
{

	
	public void getPizza() 
	{
		System.out.println("This is Non-Veg Pizza");
	}

}
