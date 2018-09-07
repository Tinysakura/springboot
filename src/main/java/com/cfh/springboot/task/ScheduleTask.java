package com.cfh.springboot.task;

import org.springframework.stereotype.Component;

@Component
public class ScheduleTask {

    //@Scheduled(fixedRate = 1000)
    public void testScheduleTask(){
        System.out.println("hello world");
    }
}
