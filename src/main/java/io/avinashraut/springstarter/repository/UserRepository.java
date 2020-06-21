package io.avinashraut.springstarter.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.avinashraut.springstarter.dao.Customer;

public interface UserRepository extends MongoRepository<Customer, Integer>{

}
