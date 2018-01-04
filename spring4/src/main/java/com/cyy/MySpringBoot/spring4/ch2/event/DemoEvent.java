package com.cyy.MySpringBoot.spring4.ch2.event;

import org.springframework.context.ApplicationEvent;

public class DemoEvent extends ApplicationEvent{
	private static final long serialVersionUID = 1L;
	private String msg;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public DemoEvent(Object source,String msg) {
		// TODO Auto-generated constructor stub
		super(source);
		this.msg = msg;
	}
}
