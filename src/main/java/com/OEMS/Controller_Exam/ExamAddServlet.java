package com.OEMS.Controller_Exam;

import com.OEMS.dao_exam.ExamDao;
import com.OEMS.dao_exam.ExamDaoImpl;
import com.OEMS.demo.Question;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ExamAddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Question qst = new Question();
        //调用请求对象读取请求头中的请求参数信息
        qst.setTitle(request.getParameter("title"));
        qst.setStyle(request.getParameter("style"));
        qst.setOptionA(request.getParameter("optionA"));
        qst.setOptionB(request.getParameter("optionB"));
        qst.setOptionC(request.getParameter("optionC"));
        qst.setOptionD(request.getParameter("optionD"));
        qst.setAnswer(request.getParameter("answer"));
        //调用dao类将用户信息以SQL命令的形式推送到数据库服务器
        ExamDao dao = new ExamDaoImpl();
        int res = dao.Add_Exam(qst);
        if(res == 1){
            request.setAttribute("info","试题添加成功");
        } else {
            request.setAttribute("info","试题添加失败");
        }

        ServletContext application = request.getServletContext(); //标志
        application.setAttribute("flag","1");
        request.getRequestDispatcher("/jsp/info.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
