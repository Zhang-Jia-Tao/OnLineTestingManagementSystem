package com.OEMS.Controller_User;

import com.OEMS.dao_user.UserDao;
import com.OEMS.dao_user.UserDaoImpl;
import com.OEMS.demo.Users;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class UserAddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        String email = request.getParameter("email");

        Users user = new Users(null,username,password,sex,email);

        //调用dao
        UserDao dao = new UserDaoImpl();
        int res = dao.User_Add(user);

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        if(res == 1){
            out.print("<font style='color:red;font-size:40'>用户信息注册成功</font>");
        } else {
            out.print("<font style='color:red;font-size:40'>用户信息注册成功</font>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
