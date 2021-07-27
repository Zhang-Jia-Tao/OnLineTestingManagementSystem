package com.OEMS.dao_user;

import com.OEMS.demo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    //用户登陆
    public Integer User_Login(@Param("username")String username, @Param("password")String password);

    //添加用户
    public Integer User_Add(Users user);

    //用户信息查询
    public List<Users> User_Query();

    //更新用户信息
    public Integer User_Update(Users users);


}
