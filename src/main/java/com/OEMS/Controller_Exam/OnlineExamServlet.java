package com.OEMS.Controller_Exam;

import com.OEMS.dao_exam.ExamDao;
import com.OEMS.dao_exam.ExamDaoImpl;
import com.OEMS.demo.Question;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class OnlineExamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String style = request.getParameter("style");
        ExamDao dao = new ExamDaoImpl();
        List<Question> questions = dao.Online_Exam(style);
        HttpSession session = request.getSession();
        session.setAttribute("questions",questions);
        session.setAttribute("style_sub",style);
        request.getRequestDispatcher("/jsp/push_exam.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
