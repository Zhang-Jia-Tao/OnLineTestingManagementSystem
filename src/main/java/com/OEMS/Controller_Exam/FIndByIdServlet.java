package com.OEMS.Controller_Exam;

import com.OEMS.dao_exam.ExamDao;
import com.OEMS.dao_exam.ExamDaoImpl;
import com.OEMS.demo.Question;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class FIndByIdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.调用请求对象读取请求头中的参数信息，得到试题编号
        String questionId = request.getParameter("questionId");
        //2.调用Dao推送查询命令得到这个试题编号对应的试题信息
        ExamDao dao = new ExamDaoImpl();
        Question question = dao.FindById_Exam(Integer.valueOf(questionId));
        //3.调用question_update.jsp将试题信息写入到响应体中
        request.setAttribute("update",question);
        request.getRequestDispatcher("/jsp/update_exam.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
