package io.damonP.springstarter.services;

import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.damonP.springstarter.dao.Order;

@Service
public class Common {
	
	@Autowired
    private RabbitTemplate template;

    @Autowired
    private Queue queue;
    
    ObjectMapper mapper = new ObjectMapper();

    @Scheduled(fixedDelay = 1000, initialDelay = 500)
    public void rabbitMqSender(Order order) {
    	
        try {
			this.template.convertAndSend(queue.getName(), mapper.writeValueAsString(order));
		} catch (AmqpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(" [x] Sent '" + order);
    }

}
