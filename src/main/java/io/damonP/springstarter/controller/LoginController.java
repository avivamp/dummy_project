package io.damonP.springstarter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.damonP.springstarter.dao.Customer;
import io.damonP.springstarter.repository.CustomerRepository;
import io.damonP.springstarter.services.LoginServices;

@RestController
@RequestMapping("/rest/users")
public class LoginController {
	
	@Autowired
	private LoginServices loginServices;
	
	@Autowired
	private CustomerRepository customerRepository;

	@RequestMapping("/getProfileDetails")
	public String getProfile() {
		return "Welcome 2020";
	}
	
	@RequestMapping("/getAllLogins")
	public List<Customer> getLogins() {
		return customerRepository.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/createProfile")
	public String createProfile(@RequestBody Customer customer) {
		return loginServices.addprofile(customer);
	}
}
