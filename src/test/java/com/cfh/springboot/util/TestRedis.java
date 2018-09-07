package com.cfh.springboot.util;

import com.cfh.springboot.SpringbootApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestRedis extends SpringbootApplicationTests {

    @Autowired
    private RedisClient redisClient = new RedisClient();

    @Test
    public void testSet(){
        try {
            redisClient.set("key1","xjf");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGet(){
        try {
            System.out.println(redisClient.get("key1"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }











}
