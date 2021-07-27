package com.OEMS.Controller_Admin;

import com.OEMS.dao_exam.ExamDao;
import com.OEMS.dao_exam.ExamDaoImpl;
import com.OEMS.demo.Score;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class QueryScoreServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ExamDao dao = new ExamDaoImpl();
        List<Score> scores = dao.Query_Score();
        request.setAttribute("score",scores);
        request.getRequestDispatcher("/jsp/ShowScore.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
