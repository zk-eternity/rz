package com.zk.test;

import com.zk.pojo.User;
import com.zk.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class testService {
    @Autowired
    private UserService userService;

    @Test
    public void testUserService(){
        User wirth = userService.queryUserByUsernameAndPassword("wirth", "123");
        System.out.println(wirth.toString());
    }
}
