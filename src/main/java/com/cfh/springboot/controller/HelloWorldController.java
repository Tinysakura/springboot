package com.cfh.springboot.controller;

import com.cfh.springboot.pojo.User;
import com.cfh.springboot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Autowired
    private TestService testService;

    @RequestMapping("/helloworld")
    public String helloworld() {
        return "hello world";
    }

    @RequestMapping("/testmybatis")
    public User testmybatis(int id) {
        return testService.selectByPrimaryKey(id);
    }
}
