package com.cyy.springboot.mybatis.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyy.springboot.mybatis.rest.dao.CityDao;
import com.cyy.springboot.mybatis.rest.domain.City;
import com.cyy.springboot.mybatis.rest.service.CityService;

/**
 * 城市业务逻辑实现类
 */
@Service
public class CityServiceImpl implements CityService{

	@Autowired
	CityDao cityDao;
	
	@Override
	public City findCityByName(String cityName) {
		// TODO Auto-generated method stub
		return cityDao.findByName(cityName);
	}

	
}
