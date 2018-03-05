package com.cyy.springboot.shiro.dao;

import org.springframework.data.repository.CrudRepository;

import com.cyy.springboot.shiro.domain.entity.UserInfo;

public interface UserInfoDao extends CrudRepository<UserInfo,Long> {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}