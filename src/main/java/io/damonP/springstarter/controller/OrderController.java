package io.damonP.springstarter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.damonP.springstarter.dao.Order;
import io.damonP.springstarter.services.OrderServices;

@RestController
@RequestMapping("/rest/order")
public class OrderController {
	
	@Autowired
	private OrderServices orderServices;
	
	@RequestMapping("/getOrders")
	public List<Order> getOrders() {
		return orderServices.listOrders();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/createOrder")
	public String createOrder(@RequestBody Order order) {
		return orderServices.createOrder(order);
	}

}
