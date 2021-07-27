package com.OEMS.Controller_Exam;

import com.OEMS.demo.Question;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class AccountScoreServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int score = 0;
        HttpSession session = request.getSession(false);
        List<Question> questions = (List<Question>) session.getAttribute("questions");
        for(Question question:questions){
            if(question.getAnswer().equals(request.getParameter("answer_"+question.getQuestionId()))){
                score+=25;
            }
        }
        request.setAttribute("info",score+"");
        //用于用来得到成绩查询的分数信息
        session.setAttribute("score",score);
        request.getRequestDispatcher("/jsp/info.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
