package com.OEMS.dao_admin;

import com.OEMS.demo.Admin;
import com.OEMS.util.util;
import org.apache.ibatis.session.SqlSession;

public class AdminDaoImpl implements AdminDao{


    //管理员登陆
    @Override
    public int Admin_Login(Admin admin) {
        SqlSession session = util.getSqlSession();
        AdminDao dao = session.getMapper(AdminDao.class);
        Integer res = dao.Admin_Login(admin);
        return res;
    }
}
