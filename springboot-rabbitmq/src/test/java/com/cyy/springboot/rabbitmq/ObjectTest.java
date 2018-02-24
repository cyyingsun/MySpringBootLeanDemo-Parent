package com.cyy.springboot.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cyy.springboot.rabbitmq.model.User;
import com.cyy.springboot.rabbitmq.object.ObjectSender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ObjectTest {

	@Autowired
	private ObjectSender objectSender;
	
	@Test
	public void ObjectSendTest() throws Exception {
		User user = new User();
		user.setName("cyy");
		user.setPass("123456");
		objectSender.send(user);
	}
}
