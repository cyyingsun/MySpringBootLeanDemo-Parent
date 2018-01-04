package com.cyy.MySpringBoot.spring4.ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AsyncMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
		
		AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
		
		for(int i=0 ;i< 10; i++){
			asyncTaskService.executeAnsycTask(i);
			asyncTaskService.executeAnsycTaskPlus(i);
		}
		
		context.close();
	}
}
