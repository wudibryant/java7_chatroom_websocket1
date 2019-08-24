package com.bittech.java7.chatroom.dao;

import com.bittech.java7.chatroom.entity.User;
import lombok.Data;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
@Data
public class AccountDaoTest {
    private AccountDao accountDao = new AccountDao();
    @Test
    public void userLogin() {
        User user = accountDao.userLogin("test","123");
        System.out.println(user);
        Assert.assertNotNull(user);
    }

    @Test
    public void userRegister() {
        User user = new User();
        user.setUserName("test");
        user.setPassword("123");
        boolean isSuccess = accountDao.userRegister(user);
        Assert.assertEquals(true,isSuccess);
    }
}