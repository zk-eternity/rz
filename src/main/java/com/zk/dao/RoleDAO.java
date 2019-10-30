package com.zk.dao;

import org.apache.ibatis.annotations.Param;

import java.util.Set;

public interface RoleDAO {
    Set<String> queryRoleByName(@Param("username") String username);
}
