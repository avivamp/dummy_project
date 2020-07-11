package io.damonP.springstarter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.damonP.springstarter.dao.Order;
import io.damonP.springstarter.services.Common;
import io.damonP.springstarter.services.OrderServices;

@RestController
@RequestMapping("/rest/order")
public class OrderController {
	
	@Autowired
	private OrderServices orderServices;
	
	@Autowired
	private Common common;
	
	@RequestMapping("/getOrders")
	public List<Order> getOrders() {
		return orderServices.listOrders();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/createOrder")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void createOrder(@RequestBody Order order) {
		common.rabbitMqSender(order);
	}

}
