package com.cyy.springboot.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cyy.springboot.rabbitmq.topic.TopicSender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicTest {

	@Autowired
	TopicSender topicSender;
	
	@Test
	public void topicSendTest() {
		topicSender.send();
	}
	
	@Test
	public void topic1SendTest() {
		topicSender.send1();
	}
	
	@Test
	public void topic2SendTest() {
		topicSender.send2();
	}
}
