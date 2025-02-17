package FirstSpringPackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoFirstSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(DemoFirstSpringBootApplication.class, args);
//		Internet st=con.getBean(Internet.class);
//		st.connection();
		
		Buyer st=con.getBean(Buyer.class);
		st.buy();
	}

}
