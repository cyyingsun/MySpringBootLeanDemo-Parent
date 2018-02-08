package com.cyy.springboot.mybatis.annotion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cyy.springboot.mybatis.annotion.dao.CityDao;
import com.cyy.springboot.mybatis.annotion.domain.City;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MabitsAnnotaionTest {

	@Autowired
	CityDao cityDao;
	
	@Test
	public void testInsert() {
		cityDao.insertCity(new City( 4L, "武汉", "武汉周黑鸭"));
	}
	
	@Test
	public void testUpdate() {
		City city = cityDao.findByName("杭州");
		city.setDescription("杭州是很不错的城市");
		cityDao.update(city);
	}
}
