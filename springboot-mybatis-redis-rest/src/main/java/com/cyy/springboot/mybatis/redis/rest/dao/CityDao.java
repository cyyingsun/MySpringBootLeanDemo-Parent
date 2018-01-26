package com.cyy.springboot.mybatis.redis.rest.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cyy.springboot.mybatis.redis.rest.domain.City;


/**
 * 城市 DAO 接口类
 */
public interface CityDao {

	/**
	 * 根据名称查询
	 * @param cityName
	 * @return
	 */
	public City findByName(@Param("cityName") String cityName);
	
    /**
     * 获取城市信息列表
     *
     * @return
     */
    List<City> findAllCity();

    /**
     * 根据城市 ID，获取城市信息
     *
     * @param id
     * @return
     */
    City findById(@Param("id") Long id);

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);
}
