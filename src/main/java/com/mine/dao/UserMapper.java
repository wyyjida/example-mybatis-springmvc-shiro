package com.mine.dao;

import com.mine.entity.User;
import com.sun.beans.editors.IntegerEditor;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User findOneById(Integer id);

    User findByUsername(String username);

}