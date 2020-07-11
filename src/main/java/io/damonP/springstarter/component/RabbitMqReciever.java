package io.damonP.springstarter.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.damonP.springstarter.dao.Order;
import io.damonP.springstarter.services.OrderServices;

import java.util.concurrent.CountDownLatch;

@Component
public class RabbitMqReciever {

	private CountDownLatch latch = new CountDownLatch(1);

	@Autowired
	private OrderServices orderServices;

	ObjectMapper mapper = new ObjectMapper();

	public void receiveMessage(String message) {
		System.out.println("Received <" + message + ">");
		Order data;
		try {
			data = mapper.readValue(message, Order.class);
			orderServices.createOrder(data);
			latch.countDown();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public CountDownLatch getLatch() {
		return latch;
	}

}
