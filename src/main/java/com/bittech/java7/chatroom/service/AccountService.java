package com.bittech.java7.chatroom.service;

import com.bittech.java7.chatroom.dao.AccountDao;
import com.bittech.java7.chatroom.entity.User;

/**
 * @Author: yuisama
 * @Date: 2019-08-03 10:38
 * @Description:
 */
public class AccountService {
    private AccountDao accountDao = new AccountDao();

    // 用户登陆
    public boolean userLogin(String userName,String password) {
        User user = accountDao.userLogin(userName,password);
        if (user == null) {
            return false;
        }
        return true;
    }

    // 用户注册
    public boolean userRegister(String userName,String password) {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        return accountDao.userRegister(user);
    }
}
