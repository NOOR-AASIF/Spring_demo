package FirstSpringPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Buyer {
	@Autowired
	private Shop shop;
	
	public void buy()
	{
		System.out.println("This is a Buyer");
		shop.getPizza();
	}

}
