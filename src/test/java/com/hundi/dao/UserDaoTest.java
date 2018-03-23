package com.hundi.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author LZHONG
 * @package com.hundi.dao
 * @date 3/22/2018
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class UserDaoTest {
    @Resource
    private UserDao userDao;
    @Test
    public void addUser() throws Exception {
        userDao.addUser("test1","totototo");
    }

    @Test
    public void getPassword() throws Exception {
        System.out.println(userDao.getPassword("test1"));
    }

    @Test
    public void modifyPassword() throws Exception {
        userDao.modifyPassword("test1","toto*1");
    }

    @Test
    public void getPlayerID() throws Exception {
        System.out.println(userDao.getPlayerID("test1"));
    }

}