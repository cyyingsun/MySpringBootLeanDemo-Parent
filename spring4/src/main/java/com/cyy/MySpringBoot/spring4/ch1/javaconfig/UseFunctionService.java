package com.cyy.MySpringBoot.spring4.ch1.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class UseFunctionService {

	FunctionService functionService;
	
	public FunctionService getFunctionService() {
		return functionService;
	}
	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}
	public String sayHello(String word){
		return functionService.sayHello(word);
	}
}
