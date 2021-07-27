package com.OEMS.Controller_Exam;

import com.OEMS.dao_exam.ExamDao;
import com.OEMS.dao_exam.ExamDaoImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class DeleteExamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String questionId = request.getParameter("questionId");

        ExamDao dao = new ExamDaoImpl();
        int res = dao.Delete_Exam(Integer.valueOf(questionId));

        if(res==1){
            request.setAttribute("info","删除成功");
        } else {
            request.setAttribute("info","删除失败");
        }

        request.getRequestDispatcher("/jsp/info.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
