package com.cfh.springboot.service;

import com.cfh.springboot.pojo.User;

public interface TestService {

    public User selectByPrimaryKey(int id);

    public void deleteByPrimaryKey(int id);
}
