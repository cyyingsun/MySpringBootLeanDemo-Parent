package com.cyy.MySpringBoot.spring4.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AopConfig.class);
		DemoAnnotationService demoAnnotationService = 
				context.getBean(DemoAnnotationService.class);
		demoAnnotationService.add();
		DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
		demoMethodService.add();
		context.close();
	}

}
