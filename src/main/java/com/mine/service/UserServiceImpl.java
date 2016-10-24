package com.mine.service;

import com.mine.dao.UserMapper;
import com.mine.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Named;
import java.util.List;

/**
 * Created by Acting on 2016/10/14.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    public User selectByPrimaryKey(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }

    @Override
    public User findOneById(Integer id) {
        return this.userMapper.findOneById(id);
    }

    @Override
    public User findByUsername(String username) {
        return this.userMapper.findByUsername(username);
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(User record) {
        return this.userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    public String toString() {
        return null;
    }
}
