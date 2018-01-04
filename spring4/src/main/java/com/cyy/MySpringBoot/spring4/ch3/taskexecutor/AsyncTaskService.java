package com.cyy.MySpringBoot.spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

	@Async
	public void executeAnsycTask(Integer i) {
		System.out.println("执行异步任务：" + i);
	}
	
	@Async
	public void executeAnsycTaskPlus(Integer i) {
		System.out.println("执行异步任务+1：" + (i+1));
	}
}
