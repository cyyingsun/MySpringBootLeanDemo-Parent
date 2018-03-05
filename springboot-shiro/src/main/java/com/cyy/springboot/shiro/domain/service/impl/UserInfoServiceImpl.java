package com.cyy.springboot.shiro.domain.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cyy.springboot.shiro.dao.UserInfoDao;
import com.cyy.springboot.shiro.domain.entity.UserInfo;
import com.cyy.springboot.shiro.domain.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService{
    @Resource
	UserInfoDao userInfoDao;
	
	@Override
	public UserInfo findByUsername(String username) {
		// TODO Auto-generated method stub
        System.out.println("UserInfoServiceImpl.findByUsername()");
		return userInfoDao.findByUsername(username);
	}

}
