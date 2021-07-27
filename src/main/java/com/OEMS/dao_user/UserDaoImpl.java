package com.OEMS.dao_user;

import com.OEMS.demo.Users;
import com.OEMS.util.util;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements UserDao {

    //登陆验证
    public Integer User_Login(String username,String password){
        SqlSession session = util.getSqlSession();
        UserDao dao = session.getMapper(UserDao.class);
        int num = dao.User_Login(username,password);
        return num;
    }

    //添加用户
    public Integer User_Add(Users user){
        SqlSession session = util.getSqlSession();
        UserDao dao = session.getMapper(UserDao.class);
        int res = dao.User_Add(user);
        return res;
    }

    @Override
    public List<Users> User_Query() {
        SqlSession session = util.getSqlSession();
        UserDao dao = session.getMapper(UserDao.class);
        List<Users> usersList = dao.User_Query();
        return usersList;
    }

    @Override
    public Integer User_Update(Users users) {
        SqlSession session = util.getSqlSession();
        UserDao dao = session.getMapper(UserDao.class);
        int res = dao.User_Update(users);
        return res;
    }
}
