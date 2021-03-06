package com.cyy.springboot.mybatis.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cyy.springboot.mybatis.rest.domain.City;
import com.cyy.springboot.mybatis.rest.service.CityService;

@RestController
public class CityRestController {

	@Autowired
	private CityService cityService;
	
	@RequestMapping(value="/api/city",method = RequestMethod.GET)
	public City findOneCity(@RequestParam(value="cityName",required=true) String cityName) {
		return cityService.findCityByName(cityName);
	}
	
	@RequestMapping(value="/hello")
	public String hello() {
		return "Hello Unit Test";
	}
}
