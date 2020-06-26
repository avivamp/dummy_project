package io.damonP.springstarter.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.damonP.springstarter.dao.Event;

public interface EventRepository extends MongoRepository<Event, Integer>{

}
