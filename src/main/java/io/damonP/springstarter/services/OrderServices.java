package io.damonP.springstarter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.damonP.springstarter.dao.Order;
import io.damonP.springstarter.repository.OrderRepository;

@Service
public class OrderServices {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> listOrders() {
		return orderRepository.findAll();
	}
	
	public String createOrder(Order order) {
		orderRepository.save(order);
		return "Order Created";
	}

}
