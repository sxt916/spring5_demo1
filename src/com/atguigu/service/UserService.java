package com.atguigu.service;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.UserDaoImpl;

/**
 * @author shkstart
 * @create 2021-07-23 9:57
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("is ServiceADD!");
        userDao.update();
    }

}
