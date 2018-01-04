package com.cyy.MySpringBoot.spring4.ch3.test;

public class TestBean {
	
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public TestBean(String content) {
		super();
		this.content = content;
	}
	
}
