package io.damonP.springstarter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/events")
public class EventController {

	@RequestMapping(method=RequestMethod.POST, value="/create")
	public void createEvent() {
	}
	
    @RequestMapping("/get")
    public String listAllEvents() {
    	return "";
    }
    
	@RequestMapping(method=RequestMethod.PUT, value="/update")
	public void updateEvent() {
	}
    
	@RequestMapping(method=RequestMethod.DELETE, value="/delete")
	public void deleteEvent() {
	}
}
