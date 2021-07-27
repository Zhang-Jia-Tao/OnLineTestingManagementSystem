package com.OEMS.Controller_Exam;

import com.OEMS.dao_exam.ExamDao;
import com.OEMS.dao_exam.ExamDaoImpl;
import com.OEMS.demo.Question;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class QueryExamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ExamDao dao = new ExamDaoImpl();
        List<Question> questions = dao.Query_Exam();
        //将QstList添加到请求作用域对象当中
        request.setAttribute("value",questions);
        request.getRequestDispatcher("/jsp/QueryExam.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
