package com.cyy.springboot.mongodb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cyy.springboot.mongodb.dao.UserDao;
import com.cyy.springboot.mongodb.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

	@Autowired
	UserDao userDao;
	
	@Test
	public void testSaveUser() {
		User user = new User();
		user.setId(2l);
        user.setUserName("小明");
        user.setPassWord("111111");
        userDao.saveUser(user);
	}
	
	@Test
	public void findUserByUserName() {
		User user = userDao.findUserByUserName("小明");
		System.out.println("user is " + user);
	}

	@Test
	public void updateUser() {
		User user = new User();
		user.setId(2l);
		user.setUserName("天空");
		user.setPassWord("fffxxxx");
		userDao.updateUser(user);
	}

	@Test
	public void deleteUserById() {
		userDao.deleteUserById(1l);
	}
}
