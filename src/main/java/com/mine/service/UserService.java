package com.mine.service;

import com.mine.entity.User;

import java.util.List;

/**
 * Created by Acting on 2016/10/19.
 */
public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User findOneById(Integer id);

    User findByUsername(String username);

    List<User> getAll();
}
