package com.cyy.MySpringBoot.springmvc4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyy.MySpringBoot.springmvc4.domain.DemoOnj;

@RestController
@RequestMapping("/rest")
public class DemoRestController {

	@RequestMapping(value="/getjson",produces={"application/json;charset=UTF-8"})
	public DemoOnj getJson(DemoOnj object) {
		return new DemoOnj(object.getId()+1,object.getName() + "json");
	}
	
	@RequestMapping(value = "/getxml",
			produces={"application/xml;charset=UTF-8"})//4
	public DemoOnj getXml(DemoOnj obj){
		return new DemoOnj(obj.getId()+1, obj.getName()+"yy");
	}
}
