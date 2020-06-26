package io.damonP.springstarter.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.damonP.springstarter.dao.Customer;
import io.damonP.springstarter.repository.CustomerRepository;

@Service
public class LoginServices {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public String addprofile(Customer data) {
		customerRepository.save(data);
		
		return "user created";
	}
	
	public String userLogin(Customer data) {
		return "Login Successfull";
	}

}
