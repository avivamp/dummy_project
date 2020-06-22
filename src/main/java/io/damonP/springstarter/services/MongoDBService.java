package io.damonP.springstarter.services;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import io.damonP.springstarter.dao.Customer;
import io.damonP.springstarter.repository.CustomerRepository;

@EnableMongoRepositories(basePackageClasses = CustomerRepository.class)
@Configuration
public class MongoDBService {
	
	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository userRepository) {
		return strings -> {
			
			userRepository.save(new Customer(1, "avinashraut", "abcd", "a@gmail.com"));
		};
	}

}
