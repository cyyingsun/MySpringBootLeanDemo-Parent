package com.cyy.MySpringBoot.springmvc4.domain;

public class DemoOnj {
	
	private Long id;
	private String name;

	public DemoOnj() {
		// TODO Auto-generated constructor stub
	}

	public DemoOnj(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
