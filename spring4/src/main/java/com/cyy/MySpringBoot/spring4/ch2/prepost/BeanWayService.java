package com.cyy.MySpringBoot.spring4.ch2.prepost;

public class BeanWayService {
	//【2】后执行初始化方法
	public void init() {
		System.out.println("Bean 初始化.");
	}
	
	//【1】先执行构造函数方法
	public BeanWayService(){
		super();
		System.out.println("初始化构造函数 BeanWayService.");
	}
	
	public void destroy() {
		System.out.println("Bean destroy.");
	}
}
