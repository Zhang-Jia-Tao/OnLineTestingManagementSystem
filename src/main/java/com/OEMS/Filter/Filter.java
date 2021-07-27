package com.OEMS.Filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Filter implements javax.servlet.Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpSession session = null;
        //1.调用请求对象读取请求协议包中的URI，得知用户访问的资源文件是谁
        String uri = request.getRequestURI();   //[/网站名/资源文件名]
        //如果本次请求的资源文件与登陆有关[login.html 或 UsersLoginServlet]此时应该无条件放行
        if(uri.indexOf("login")!=-1 || "/myWeb/".equals(uri) || uri.indexOf("User")!=-1
         || uri.indexOf("AdminLogin")!=-1 || uri.indexOf("html")!=-1 || uri.indexOf("jsp")!=-1){
            filterChain.doFilter(servletRequest,servletResponse);
            return;
        }
        //3.如果本次请求访问的是其他的资源文件，需要得到用户在服务端的HttpSession
        session = request.getSession(false);
        if(session != null){
            filterChain.doFilter(servletRequest,servletResponse);
            return;
        }
        //4.拒绝请求
        request.getRequestDispatcher("/Login.html").forward(servletRequest,servletResponse);

    }
}
