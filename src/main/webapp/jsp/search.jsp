<%@ page import="com.OEMS.dao_user.UserDao" %>
<%@ page import="com.OEMS.dao_user.UserDaoImpl" %>
<%@ page import="com.OEMS.dao_exam.ExamDao" %>
<%@ page import="com.OEMS.dao_exam.ExamDaoImpl" %>
<%@ page import="com.OEMS.demo.Score" %><%--
  Created by IntelliJ IDEA.
  User: zhangjiatao
  Date: 2021/7/2
  Time: 8:43 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        tr:hover {background-color:beige;}
    </style>
</head>
<body background="/images/img3.jpeg">
    <%
        HttpSession httpSession = request.getSession(false);
        ServletContext context = request.getServletContext();
        Integer score = (Integer)httpSession.getAttribute("score");
        String username = (String) context.getAttribute("username");
        String style = (String)httpSession.getAttribute("style_sub");

        Score score1 = new Score(null,username,score,style);
        ExamDao dao = new ExamDaoImpl();
        Integer res = dao.Insert_Score(score1);
    %>
    <br/>
    <br/>
    <br/>
    <div align="center">
        <table border="2">
            <tr style="height: 40px">
                <td>用户名</td>
                <td>成绩</td>
            </tr>
            <tr style="height: 40px">
                <td><%=username%></td>
                <td><%=score%></td>
            </tr>
        </table>
    </div>
</body>
</html>
