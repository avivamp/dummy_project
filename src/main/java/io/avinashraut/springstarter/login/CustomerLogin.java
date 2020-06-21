package io.avinashraut.springstarter.login;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerLogin {

	@RequestMapping("/getProfileDetails")
	public String getProfile() {
		return "avinash raut";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/createProfile")
	public String createProfile(@RequestBody Customer customer) {
		customerProfile.addprofile(customer);
	}
}
