package com.zk.service;

import org.apache.ibatis.annotations.Param;

import java.util.Set;

public interface RoleService {
    Set<String> queryRoleByName(@Param("username") String username);

}
