package SpringBootMvc1.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler
{
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<String> CustomerNotFound()
	{
		return new ResponseEntity<>("User is Invalid",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<String> ArithmeticException()
	{
		return new ResponseEntity<>("Arithmetic Exception",HttpStatus.BAD_REQUEST);
	}
}
