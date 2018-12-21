package com.bdqn.springboottask;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootTaskApplicationTests {

    @Autowired
    JavaMailSenderImpl javaMailSender;


    @Test
    public void contextLoads() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        // 邮件设置
        //标题
        simpleMailMessage.setSubject("通知");

        //  内容
        simpleMailMessage.setText("是是是");
        //  发送地址
        simpleMailMessage.setTo("WeiMao@aliyun.com");
        // 发送人
        simpleMailMessage.setFrom("2662401190@qq.com");
        javaMailSender.send(simpleMailMessage);

    }

}

