package SpringBootMvc1.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer
{
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long id;
		
		@Column(name="fullname",length=50)
		private String name;
		private String customerId;
		private String location;
		
		public Customer()
		{
			
		}

		public Customer(long id, String name, String customerId, String location)
		{
			this.id = id;
			this.name = name;
			this.customerId = customerId;
			this.location = location;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCustomerId() {
			return customerId;
		}

		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}
		
		

	


}
