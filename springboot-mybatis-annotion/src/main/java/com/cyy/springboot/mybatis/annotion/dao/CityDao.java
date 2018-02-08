package com.cyy.springboot.mybatis.annotion.dao;

import org.apache.ibatis.annotations.*;

import com.cyy.springboot.mybatis.annotion.domain.City;

/**
 * 城市 DAO 接口类
 *
 * Created by xchunzhao on 02/05/2017.
 */
@Mapper // 标志为 Mybatis 的 Mapper
public interface CityDao {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    @Select("SELECT * FROM city where city_name=#{cityName}")
    // 返回 Map 结果集
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "provinceId", column = "province_id"),
            @Result(property = "cityName", column = "city_name"),
            @Result(property = "description", column = "description"),
    })
    City findByName(@Param("cityName") String cityName);
    
    @Insert("insert into city (province_id,city_name,description) value (#{provinceId},#{cityName},#{description})")
    void insertCity(City city);
    
    @Update("update city set province_id=#{provinceId},city_name=#{cityName},description=#{description} where id=#{id}")
    void update(City city);
}
