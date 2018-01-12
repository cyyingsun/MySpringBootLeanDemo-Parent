package com.cyy.MySpringBoot.springmvc4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cyy.MySpringBoot.springmvc4.domain.DemoOnj;

@Controller
public class AdviceController {

	@RequestMapping("/advice")
	public String getSomething(@ModelAttribute("msg") String msg,DemoOnj obj) {
		throw new IllegalArgumentException("Sorry,参数有误/" + "来自ModelAttribute" +
				msg);
	}
	
	
}
