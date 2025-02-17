package SpringBootMvc1.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import SpringBootMvc1.Entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>
{
	// Query Language
	
	public Customer findByName(String name);
	
	public Customer findByNameAndLocation(String name,String location);
	
	public Customer findByNameOrLocation(String name,String location);
	
	//JPQL => Java Persistancy Query Language
	
	@Query("select p from Customer p where name=?1")
	public Customer getName(String name);
	
	@Query("select p from Customer p where id>=?1")
	public List<Customer> getCustomerGreaterThan(long id);
	
	//Native Query => SQL Query ....>Fetching data
	
	@Query(value="select * from customer where location=?1",nativeQuery=true)
	public Customer getByLocation(String location);
	
	@Query(value="select * from Customer where id<=?1",nativeQuery=true)
	public List<Customer> getByIdLesserThan(Long id);

	
}
