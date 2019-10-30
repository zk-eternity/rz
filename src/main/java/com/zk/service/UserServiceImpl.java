package com.zk.service;

import com.zk.dao.UserDAO;
import com.zk.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) {
        return userDAO.queryUserByUsernameAndPassword(username, password);
    }

    @Override
    public User queryUserByUsername(String username) {
        return userDAO.queryUserByUsername(username);
    }

    @Override
    public User UpdateUserByUsername(String username,String password) {
        return userDAO.UpdateUserByUsername(username,password);
    }
}
