package com.cyy.springboot.mybatis.rest.dao;

import org.apache.ibatis.annotations.Param;

import com.cyy.springboot.mybatis.rest.domain.City;

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
}
