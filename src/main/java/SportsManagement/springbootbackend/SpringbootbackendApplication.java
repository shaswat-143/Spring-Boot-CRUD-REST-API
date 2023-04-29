package SportsManagement.springbootbackend;

import SportsManagement.springbootbackend.model.Employee;
import SportsManagement.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootbackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootbackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstname("Shaswat");
		employee.setLastname("Pradhan");
		employee.setEmailId("saswatpradhan102@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstname("Ashutosh");
		employee1.setLastname("Satapathy");
		employee1.setEmailId("200301120016@cutm.ac.in");
		employeeRepository.save(employee1);
	}
	}

