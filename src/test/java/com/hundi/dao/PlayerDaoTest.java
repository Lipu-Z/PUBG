package com.hundi.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author LZHONG
 * @package com.hundi.dao
 * @date 3/23/2018
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class PlayerDaoTest {

    @Autowired
    private PlayerDao playerDao;
    @Test
    public void getKillCount() throws Exception {
        int count = playerDao.getKillCount("117");
        assertEquals(20,count);
    }

    @Test
    public void getDeatCount() throws Exception {
        int count = playerDao.getStatus("117");
        assertEquals(1,count);
    }

    @Test
    public void getPlayCount() throws Exception {
        int count = playerDao.getPlayCount("117");
        assertEquals(10,count);
    }

    @Test
    public void getStatus() throws Exception {
        int count = playerDao.getDeathCount("117");
        assertEquals(5,count);
    }

}