package com.zk.test;

import com.zk.dao.UserDAO;
import com.zk.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class testDAO {
    @Autowired
    private UserDAO userDAO;

    @Test
    public void testUserDAO() {
        User wirth = userDAO.queryUserByUsernameAndPassword("wirth", "123");
        System.out.println(wirth.toString());
    }

}
