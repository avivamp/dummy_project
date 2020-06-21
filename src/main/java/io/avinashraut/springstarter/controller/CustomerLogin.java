package io.avinashraut.springstarter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.avinashraut.springstarter.dao.Customer;
import io.avinashraut.springstarter.services.LoginServices;

@RestController
public class CustomerLogin {
	
	@Autowired
	private LoginServices loginServices;

	@RequestMapping("/getProfileDetails")
	public String getProfile() {
		return "avinash raut";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/createProfile")
	public String createProfile(@RequestBody Customer customer) {
		return loginServices.addprofile(customer);
	}
}
