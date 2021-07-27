package com.OEMS.Controller_Admin;

import com.OEMS.dao_admin.AdminDao;
import com.OEMS.dao_admin.AdminDaoImpl;
import com.OEMS.demo.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AdminLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        Admin admin = new Admin(name,password);
        AdminDao dao = new AdminDaoImpl();
        int res = dao.Admin_Login(admin);
        if(res != 1){
            request.getRequestDispatcher("/html/AdminLogin.html").forward(request,response);
        } else {
            ServletContext application = request.getServletContext();
            application.setAttribute("User","1");
            HttpSession session = request.getSession();
            request.getRequestDispatcher("/html/index.html").forward(request,response);
        }



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
