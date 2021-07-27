package com.OEMS.Controller_User;

import com.OEMS.dao_user.UserDao;
import com.OEMS.dao_user.UserDaoImpl;
import com.OEMS.demo.Users;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class QueryUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //1.调用dao，将查询命令推送到数据库服务器上，得到所有用户的信息
        UserDao dao = new UserDaoImpl();
        List<Users> users = dao.User_Query();

        req.setAttribute("users",users);
        req.getRequestDispatcher("/jsp/QueryUser.jsp").forward(req,resp);

    }
}
