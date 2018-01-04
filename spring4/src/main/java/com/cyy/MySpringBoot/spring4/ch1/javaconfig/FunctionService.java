package com.cyy.MySpringBoot.spring4.ch1.javaconfig;

import org.springframework.stereotype.Service;

public class FunctionService {

	public String sayHello(String word){
		return "Hello " + word + "!";
	}
}
