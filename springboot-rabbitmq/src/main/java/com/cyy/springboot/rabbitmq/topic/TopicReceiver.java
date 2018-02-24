package com.cyy.springboot.rabbitmq.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues="topic.message.q1")
public class TopicReceiver {

	@RabbitHandler
	public void process(String message) {
		 System.out.println("Topic Receiver1  : " + message);
	}
}
