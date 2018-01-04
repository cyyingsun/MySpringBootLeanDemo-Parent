package com.cyy.MySpringBoot.spring4.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent>{

	@Override
	public void onApplicationEvent(DemoEvent event) {
		// TODO Auto-generated method stub
		String msg = event.getMsg();
		System.out.println("我（bean-demoListener） 接手到了bean-demoPublisher 发布的消息" + 
				msg);
	}

}
