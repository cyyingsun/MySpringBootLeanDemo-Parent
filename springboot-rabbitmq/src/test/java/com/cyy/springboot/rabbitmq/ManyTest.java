package com.cyy.springboot.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cyy.springboot.rabbitmq.many.CyySender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyTest {

	@Autowired
	private CyySender cyySender;
	
	@Test
	public void oneToMany() throws Exception{
		for(int i=0;i < 10; i++){
			cyySender.send(i);
		}
	}
}
