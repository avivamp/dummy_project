package io.damonP.springstarter.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.damonP.springstarter.dao.Customer;

public interface EventRepository extends MongoRepository<Customer, Integer>{

}
