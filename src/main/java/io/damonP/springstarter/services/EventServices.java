package io.damonP.springstarter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.damonP.springstarter.dao.Event;
import io.damonP.springstarter.repository.EventRepository;

@Service
public class EventServices {
	
	@Autowired
	private EventRepository eventRepository;
	
	public String addEvent(Event data) {
		
		eventRepository.save(data);
		return "Create Event";
	}
	
	public List<Event> listEvents() {
		
		return eventRepository.findAll();

	}

}
