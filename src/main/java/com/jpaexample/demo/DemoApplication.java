package com.jpaexample.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.jpaexample.jpainterface.UserRepository;
import com.jpaexample.models.User;

@SpringBootApplication
@EntityScan("com.jpaexample")
@EnableJpaRepositories("com.jpaexample")
public class DemoApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new User( "jaypogiTA", "09435364654", "J@Y.com", "Inofr", "MALE"));


			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (User customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			User customer = repository.findOne(5);
			log.info("Customer found with findOne(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");

			// fetch customers by last name
			log.info("Customer found with findbyaddress('?'):");
			log.info("--------------------------------------------");
			for (User bauer : repository.findByAddressAndFullname("Inofr","jaypogiTA")) {
				log.info(bauer.toString());
			}
			log.info("");
		};
	}
}
