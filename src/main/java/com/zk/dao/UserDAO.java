package com.zk.dao;

import com.zk.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserDAO {
    User queryUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    User queryUserByUsername(@Param("username")String username);

    User UpdateUserByUsername(@Param("username")String username,@Param("password")String password);
}
