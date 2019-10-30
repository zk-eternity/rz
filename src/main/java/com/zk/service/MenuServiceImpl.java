package com.zk.service;

import com.zk.pojo.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuService menuService;

    @Override
    public Set<String> queryPermissionByName(String username) {
        return menuService.queryPermissionByName(username);
    }

    @Override
    public List<Menu> findDir(String username, Integer parentId) {
        return menuService.findDir(username, parentId);
    }

    @Override
    public List<Menu> findMenu(String username) {
        return null;
    }
}
