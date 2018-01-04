package com.cyy.MySpringBoot.spring4.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DiConfig.class);
		UseFunctionService useFunctionService = 
				context.getBean(UseFunctionService.class);
		System.out.println(useFunctionService.sayHello("Di first demo"));
		context.close();
	}

}
