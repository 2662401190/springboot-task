package com.bdqn.springboottask.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * 定时 处理
 */
@Service
public class ScheduledService {


    /**
     * 每5秒执行一次
     */
    @Scheduled(cron = "0/5 * * * * ?")
    public void hello01(){

        System.out.println("..");
        System.out.println("hello...");
    }

}
