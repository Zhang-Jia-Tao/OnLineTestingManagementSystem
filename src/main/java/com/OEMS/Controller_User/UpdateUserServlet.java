package com.OEMS.Controller_User;

import com.OEMS.dao_user.UserDao;
import com.OEMS.dao_user.UserDaoImpl;
import com.OEMS.demo.Users;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class UpdateUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1.调用请求对象读取请求头参数
        String userid=request.getParameter("userid");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        Users users = new Users(Integer.valueOf(userid),username,password,sex,email);
        //2.调用dao将用户编号填充到delete命令并发送到数据库服务器
        UserDao dao = new UserDaoImpl();
        int result = dao.User_Update(users);
        //3.调用响应对象将处理结果以二进制写入到响应体，交给浏览器
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        if(result == 1){
            out.print("<font style='color:red;font-size:40'>用户信息更新成功</font>");
        } else {
            out.print("<font style='color:red;font-size:40'>用户信息更新失败</font>");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
