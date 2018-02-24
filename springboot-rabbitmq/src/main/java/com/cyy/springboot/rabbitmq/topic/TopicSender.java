package com.cyy.springboot.rabbitmq.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicSender {

	@Autowired
	AmqpTemplate rabbitTemplate;
	
	public void send() {
		String content = "hi, i am message all";
		System.out.println("Sender : " + content);
		rabbitTemplate.convertAndSend("topicExchange", "topic.message", content);
	}
	
	public void send1() {
		String context = "hi, i am message 1";
		System.out.println("Sender : " + context);
		this.rabbitTemplate.convertAndSend("topicExchange", "topic.message.q1", context);
	}

	public void send2() {
		String context = "hi, i am messages 2";
		System.out.println("Sender : " + context);
		this.rabbitTemplate.convertAndSend("topicExchange", "topic.message.q2", context);
	}
}
