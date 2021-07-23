package com.atguigu.testdemo;

import com.atguigu.Book;
import com.atguigu.Orders;
import com.atguigu.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shkstart
 * @create 2021-07-19 18:06
 */
public class TsetSpring5 {
    @Test
    public void testAdd(){
        //加载Spring的配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        //获取Spring配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }
    @Test
    public void testBook(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book.getBname()+book.getBauthor());
        book.testDemo();
    }
    @Test
    public void testOreder(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        Orders order = context.getBean("order", Orders.class);
        order.ordersTest();
    }
}
