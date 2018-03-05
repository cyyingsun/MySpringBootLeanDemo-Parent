package com.cyy.springboot.shiro.domain.service;

import com.cyy.springboot.shiro.domain.entity.UserInfo;

public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
