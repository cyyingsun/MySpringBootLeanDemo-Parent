package com.cyy.springboot.rabbitmq.many;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CyySender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send(int i) {
		String context = "spirng boot cyy queue"+" ****** "+i;
		System.out.println("Sender1 : " + context);
		this.rabbitTemplate.convertAndSend("cyy", context);
	}

}