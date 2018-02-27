package com.cyy.springboot.mongodb.dao;

import com.cyy.springboot.mongodb.domain.User;

/**
 * Created by summer on 2017/5/5.
 */
public interface UserDao  {

    public void saveUser(User user);

    public User findUserByUserName(String userName);

    public void updateUser(User user);

    public void deleteUserById(Long id);

}
