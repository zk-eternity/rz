package com.zk.service;

import com.zk.dao.RoleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleDAO roleDAO;

    @Override
    public Set<String> queryRoleByName(String username) {
        return roleDAO.queryRoleByName(username);
    }
}
