package io.avinashraut.springstarter.services;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import io.avinashraut.springstarter.dao.Customer;
import io.avinashraut.springstarter.repository.UserRepository;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBService {
	
	CommandLineRunner commandLineRunner(UserRepository userRepository) {
		return strings -> {
			userRepository.save(new Customer(1, "avinashraut", "abcd", "a@gmail.com"));
		};
	}

}
