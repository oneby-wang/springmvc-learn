package com.oneby.service.impl;

import com.oneby.dao.UserDao;
import com.oneby.service.UserService;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author Oneby
 * @Date 2021/3/6 15:12
 * @Version 1.0
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.save();
    }

}
