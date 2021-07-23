package com.atguigu.testdemo;

import com.atguigu.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shkstart
 * @create 2021-07-23 10:31
 */
public class TestBean {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();

    }
}
