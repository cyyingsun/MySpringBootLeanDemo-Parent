package com.cyy.springboot.mybatis.annotion.service.impl;

import com.cyy.springboot.mybatis.annotion.dao.CityDao;
import com.cyy.springboot.mybatis.annotion.domain.City;
import com.cyy.springboot.mybatis.annotion.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 城市业务逻辑实现类
 *
 * Created by xchunzhao on 02/05/2017.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }

}
