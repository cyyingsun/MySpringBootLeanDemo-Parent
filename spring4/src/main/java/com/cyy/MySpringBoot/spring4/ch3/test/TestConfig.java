package com.cyy.MySpringBoot.spring4.ch3.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class TestConfig {

	@Bean
	@Profile("dev")
	public TestBean devTestBean(){
		return new TestBean("DEV TEST BEAN");
	}
	
	@Bean
	@Profile("pro")
	public TestBean proTestBean(){
		return new TestBean("PRO TEST BEAN");
	}
}
