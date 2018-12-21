package com.bdqn.springboottask.service;


import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 多线程
 */
@Service
public class AsyncService {


    /**
     *  async 表示这是一个多线程的方法
     */
    @Async
    public void hallo(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("处理数据中");
    }
}
