package FirstSpringPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class Internet {
	
	private Airtel airtel;
	
	
//	public Internet(Airtel airtel)
//	{
//		this.airtel=airtel;
//	}
	@Autowired
	public void setAirtel(Airtel airtel)
	{
		this.airtel=airtel;
	}
	public void connection()
	{
		System.out.println("This is a Connection");
		airtel.AirtelConnection();
	}

}
