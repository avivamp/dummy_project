package io.damonP.springstarter.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.damonP.springstarter.dao.Order;

public interface OrderRepository extends MongoRepository<Order, Integer>{

}
