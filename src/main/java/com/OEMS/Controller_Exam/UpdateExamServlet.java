package com.OEMS.Controller_Exam;

import com.OEMS.dao_exam.ExamDao;
import com.OEMS.dao_exam.ExamDaoImpl;
import com.OEMS.demo.Question;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


public class UpdateExamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Question question = new Question();
        question.setQuestionId(Integer.valueOf(request.getParameter("questionId")));
        question.setTitle(request.getParameter("title"));
        question.setOptionA(request.getParameter("optionA"));
        question.setOptionB(request.getParameter("optionB"));
        question.setOptionC(request.getParameter("optionC"));
        question.setOptionD(request.getParameter("optionD"));
        question.setAnswer(request.getParameter("answer"));

        ExamDao dao = new ExamDaoImpl();
        int res = dao.Update_Exam(question);
        if(res==1){
            request.setAttribute("info","试题更新成功");
        } else {
            request.setAttribute("info","试题更新失败");
        }

        String flag = "3";
        request.setAttribute("flag",flag);
        request.getRequestDispatcher("/jsp/info.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
