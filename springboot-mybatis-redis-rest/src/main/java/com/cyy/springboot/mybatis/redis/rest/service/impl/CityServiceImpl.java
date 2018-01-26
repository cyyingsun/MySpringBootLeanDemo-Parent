package com.cyy.springboot.mybatis.redis.rest.service.impl;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.cyy.springboot.mybatis.redis.rest.dao.CityDao;
import com.cyy.springboot.mybatis.redis.rest.domain.City;
import com.cyy.springboot.mybatis.redis.rest.service.CityService;


/**
 * 城市业务逻辑实现类
 */
@Service
public class CityServiceImpl implements CityService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CityServiceImpl.class);

	@Autowired
	private CityDao cityDao;
	
    @Autowired
    private RedisTemplate redisTemplate;
	
	@Override
	public City findCityByName(String cityName) {
		// TODO Auto-generated method stub
		return cityDao.findByName(cityName);
	}

	@Override
	public City findCityById(Long id) {
		// TODO Auto-generated method stub
		//先从缓存中获取城市信息
		String key = "city_" + id;
		ValueOperations<String, City> operations = redisTemplate.opsForValue();
		
		//缓存是否存在
		boolean hasKey = redisTemplate.hasKey(key);
		if(hasKey){
			City city = operations.get(key);
			 LOGGER.info("CityServiceImpl.findCityById() : 从缓存中获取了城市 >> " + city.toString());
	         return city;
		}
		
		//从DB中获取
		City city = cityDao.findById(id);
		//放入缓存中
		operations.set(key, city, 60, TimeUnit.SECONDS);
		LOGGER.info("CityServiceImpl.findCityById() : 城市插入缓存 >> " + city.toString());
		
		return city;
	}

	//保存
	@Override
	public Long saveCity(City city) {
		// TODO Auto-generated method stub
		 return cityDao.saveCity(city);
	}

	@Override
	public Long updateCity(City city) {
		// TODO Auto-generated method stub
		Long result = cityDao.updateCity(city);
		
		String key =  "city_" + city.getId();
		boolean hasKey = redisTemplate.hasKey(key);
		
		if(hasKey){
			redisTemplate.delete(key);
			LOGGER.info("CityServiceImpl.updateCity() : 从缓存中删除城市 >> " + city.toString());
		}
		
		return result;
	}

	@Override
	public Long deleteCity(Long id) {
		// TODO Auto-generated method stub
		Long ret = cityDao.deleteCity(id);

        // 缓存存在，删除缓存
        String key = "city_" + id;
        boolean hasKey = redisTemplate.hasKey(key);
        if (hasKey) {
            redisTemplate.delete(key);

            LOGGER.info("CityServiceImpl.deleteCity() : 从缓存中删除城市 ID >> " + id);
        }
        return ret;
	}

	
}
