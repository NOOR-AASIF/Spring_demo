package SpringBootMvc1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import SpringBootMvc1.Entity.Customer;
import SpringBootMvc1.Service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController 
{
	@Autowired
	private CustomerService customerService;
	
	@PostMapping(value="/saveCustomer")
//	@ResponseBody
	public Customer saveCustomer(@RequestBody Customer customer)
	{
		Customer savedCustomer=customerService.saveCustomer(customer);
		return savedCustomer;
	}
	
	@GetMapping(value="/getById/{id}")
//	@ResponseBody
	public ResponseEntity<Customer> getById(@PathVariable("id")Long id)
	{
		Customer customer=customerService.getById(id);
		return new ResponseEntity<>(customer,HttpStatus.CREATED);
	}
	
	@PutMapping(value="/updateCustomer/{id}")
//	@ResponseBody
	public Customer updateCustomer(@PathVariable("id")Long id,@RequestBody Customer customer)
	{
		Customer saveCustomer=customerService.updateCustomer(id, customer);
		return saveCustomer;
	}
	
	@GetMapping(value="/getAllCustomer")
//	@ResponseBody
	public List<Customer> getAllCustomer()
	{
		List<Customer>customers=customerService.getAllCustomer();
		return customers;
	}
	
	@DeleteMapping(value="/deleteCustomer/{id}")
//	@ResponseBody
	public String deleteCustomer(@PathVariable("id") Long id)
	{
		String str=customerService.deleteCustomer(id);
		return str;
	}
	
	@GetMapping(value="/getByName/{name}")
	public Customer getByName(@PathVariable("name") String name)
	{
		Customer customer=customerService.findByName(name);
		return customer;
	}
	
	@GetMapping(value="/getByNameAndLocation")
	public Customer getByNameAndLocation(@RequestParam("name")String name,
										@RequestParam("location")String location)
	{
		Customer customer=customerService.findByNameAndLocation(name, location);
		return customer;
	}
	
	@GetMapping(value="/getByNameOrLocation")
	public Customer getByNameOrLocation(@RequestParam("name")String name,
										@RequestParam("location")String location)
	{
		Customer customer=customerService.findByNameOrLocation(name,location);
		return customer;
	}
	
	@GetMapping(value="/getName")
	public Customer getName(@RequestParam("name")String name)
	{
		Customer customer=customerService.getName(name);
		return customer;
	}
	
	@GetMapping(value="/getCustomerGreaterThan/{id}")
	public List<Customer> getCustomerGreaterThan(@PathVariable("id")Long id)
	{
		List<Customer>customers=customerService.getCustomerGreaterThan(id);
		return customers;
	}
	
	@GetMapping(value="/getByLocation/{location}")
	public Customer getByLocation(@PathVariable("location")String location)
	{
		Customer customer=customerService.getByLocation(location);
		return customer;
	}
	
	@GetMapping(value="/getByIdLesserThan/{id}")
	public List<Customer> getByIdLesserThan(@PathVariable("id")Long id)
	{
		List<Customer>customers=customerService.getByIdLesserThan(id);
		return customers;
	}
	
	@GetMapping(value="/div/{no1}/{no2}")
	public int div(@PathVariable("no1") int no1,@PathVariable("no2")int no2)
	{
		int div=no1/no2;
		return div;
	}

}
