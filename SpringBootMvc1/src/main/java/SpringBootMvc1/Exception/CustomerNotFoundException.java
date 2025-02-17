package SpringBootMvc1.Exception;

public class CustomerNotFoundException extends RuntimeException
{
	public CustomerNotFoundException(String str)
	{
		super(str);
	}

}
