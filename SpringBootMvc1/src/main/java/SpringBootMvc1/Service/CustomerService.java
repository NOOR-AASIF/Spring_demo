package SpringBootMvc1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringBootMvc1.Entity.Customer;
import SpringBootMvc1.Exception.CustomerNotFoundException;
import SpringBootMvc1.Repository.CustomerRepository;

@Service
public class CustomerService 
{
	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer saveCustomer(Customer customer)
	{
		Customer savedCustomer=customerRepository.save(customer);
		return savedCustomer;
	}
	
	public Customer getById(Long id)
	{
		Customer customer=customerRepository.findById(id)
				.orElseThrow(()->new CustomerNotFoundException("UserNotFound"));
				
		return customer;
	}
	
	public Customer updateCustomer(Long id,Customer customer)
	{
		Customer updateCustomer=customerRepository.findById(id).get();
		updateCustomer.setId(customer.getId());
		updateCustomer.setName(customer.getName());
		updateCustomer.setLocation(customer.getLocation());
		
		Customer saveUpdated=customerRepository.save(updateCustomer);
		return saveUpdated;
		
	}
	
	public List<Customer> getAllCustomer()
	{
		List<Customer>customers=customerRepository.findAll();
		return customers;
	}
	
	public String deleteCustomer(Long id)
	{
		Customer customer=customerRepository.findById(id).get();
		customerRepository.delete(customer);
		return "deleted succesfully";
		
	}
	
	// Query Methods
	
	public Customer findByName(String name)
	{
		Customer customer=customerRepository.findByName(name);
		return customer;
	}
	
	public Customer findByNameAndLocation(String name,String location)
	{
		Customer customer=customerRepository.findByNameAndLocation(name, location);
		return customer;
	}
	
	
	public Customer findByNameOrLocation(String name,String location)
	{
		Customer customer=customerRepository.findByNameOrLocation(name, location);
		return customer;
	}
	
	//JPQL => Java Persistancy Query Language
	
	public Customer getName(String name)
	{
		Customer customer=customerRepository.getName(name);
		return customer;
	}

	public List<Customer> getCustomerGreaterThan(Long id)
	{
		List<Customer>customers=customerRepository.getCustomerGreaterThan(id);
		return customers;
	}
	
	//Native Query
	
	public Customer getByLocation(String location)
	{
		Customer customer=customerRepository.getByLocation(location);
		return customer;
	}
	
	public List<Customer> getByIdLesserThan(Long id)
	{
		List<Customer>customers=customerRepository.getByIdLesserThan(id);
		return customers;
	}

	
	

}
