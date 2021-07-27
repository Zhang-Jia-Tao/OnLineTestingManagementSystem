package com.OEMS.Controller_User;

import com.OEMS.dao_user.UserDao;
import com.OEMS.dao_user.UserDaoImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.调用请求对象对请求体使用utf-8字符集进行重新编排
        request.setCharacterEncoding("utf-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //调用dao
        UserDao dao = new UserDaoImpl();
        int num = dao.User_Login(username,password);
        if(num == 1){//用户存在
            //在判定来访用户身份合法后，通过请求对象向Tomcat申请，为当前用户申请一个HttpSession
            HttpSession session = request.getSession();
            ServletContext context = request.getServletContext();
            context.setAttribute("username",username);
            context.setAttribute("User","0");
            response.sendRedirect("/myWeb/html/index.html");
        }else{

            response.sendRedirect("/myWeb/jsp/Error_Login.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.调用请求对象对请求体使用utf-8字符集进行重新编排
        request.setCharacterEncoding("utf-8");

        String username = request.getParameter("username");

        String password = request.getParameter("password");

        //调用dao
        UserDao dao = new UserDaoImpl();
        int num = dao.User_Login(username,password);
        if(num == 1){//用户存在
            //在判定来访用户身份合法后，通过请求对象向Tomcat申请，为当前用户申请一个HttpSession
            HttpSession session = request.getSession();
            ServletContext context = request.getServletContext();
            context.setAttribute("username",username);
            response.sendRedirect("/myWeb/html/index.html");
        }else{
            response.sendRedirect("/myWeb/jsp/Error_Login.jsp");
        }
    }
}
