package com.zk.service;

import com.zk.pojo.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

public interface MenuService {
    Set<String> queryPermissionByName(@Param("username") String username);

    //查询目录
    List<Menu> findDir(@Param("username")String username,@Param("parentId")Integer parentId);

    //查询目录下的菜单
    List<Menu> findMenu(@Param("username")String username);
}