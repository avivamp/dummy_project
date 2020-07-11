package io.damonP.springstarter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.damonP.springstarter.dao.Event;
import io.damonP.springstarter.services.EventServices;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/rest/events")
public class EventController {
	
	@Autowired
	private EventServices eventServices;

	@RequestMapping(method=RequestMethod.POST, value="/create")
	public String createEvent(@RequestBody Event eventDetails) {
		return eventServices.addEvent(eventDetails);
	}
	
    @RequestMapping("/listAll")
    public List<Event> listAllEvents() {
    	return eventServices.listEvents();
    }
    
    @RequestMapping("/{ID}/details")
    public void getEventDetails() {
    
    }
    
	@RequestMapping(method=RequestMethod.PUT, value="/update")
	public void updateEvent() {
	}
    
	@RequestMapping(method=RequestMethod.DELETE, value="/delete")
	public void deleteEvent() {
	}
}
