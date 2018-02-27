package com.cyy.springboot.mongodb.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.cyy.springboot.mongodb.dao.UserDao;
import com.cyy.springboot.mongodb.domain.User;

@Component
public class UserDaoImpl implements UserDao{
	
	@Autowired
	MongoTemplate mongoTemple;

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		mongoTemple.save(user);
	}

	@Override
	public User findUserByUserName(String userName) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("userName").is(userName));
		User user = mongoTemple.findOne(query, User.class);
				
		return user;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("id").is(user.getId()));
		Update update = new Update().set("userName", user.getUserName()).set("passWord", user.getPassWord());
		// 更新查询返回结果集的第一条
		mongoTemple.updateFirst(query, update, User.class);
	}

	@Override
	public void deleteUserById(Long id) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("id").is(id));
		mongoTemple.remove(query, User.class);
	}

}
