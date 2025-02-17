package FirstSpringPackage;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class VegPizza implements Shop {
	public void getPizza()
	{
		System.out.println("This is a Veg Pizza");
	}

}
