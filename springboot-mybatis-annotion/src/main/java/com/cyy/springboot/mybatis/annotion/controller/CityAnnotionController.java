package com.cyy.springboot.mybatis.annotion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyy.springboot.mybatis.annotion.dao.CityDao;
import com.cyy.springboot.mybatis.annotion.domain.City;

@RestController
public class CityAnnotionController {

	@Autowired
	CityDao cityDao;
	
	@RequestMapping("/getCity")
	public City getCityByName(String cityName) {
		return cityDao.findByName(cityName);
	}
	
	@RequestMapping("/addCity")
	public void addCity(City city) {
		cityDao.insertCity(city);
	}
	
	@RequestMapping("/updateCity")
	public void updateCity(City city) {
		cityDao.update(city);
	}
}
