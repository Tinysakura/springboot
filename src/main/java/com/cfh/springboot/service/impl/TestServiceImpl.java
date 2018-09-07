package com.cfh.springboot.service.impl;

import com.cfh.springboot.dao.UserMapper;
import com.cfh.springboot.pojo.User;
import com.cfh.springboot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByPrimaryKey(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
