
<%@ page import="java.util.List" %>
<%@ page import="com.OEMS.demo.Question" %><%--
  Created by IntelliJ IDEA.
  User: zhangjiatao
  Date: 2021/5/18
  Time: 9:26 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>QueryQst</title>
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

        tr:hover {background-color:lightskyblue;}
    </style>
</head>
</head>
<body background="/images/img5.jpeg">
<center>
    <table>
        <tr style="align-content:center">
            <td>题目编号</td>
            <td>题目类型</td>
            <td>题目信息</td>
            <td>A</td>
            <td>B</td>
            <td>C</td>
            <td>D</td>
            <td>正确答案</td>
            <td colspan="2">操作</td>
        </tr>
        <%
            List QstList = (List)request.getAttribute("value");
            for(int i=0;i<QstList.size();i++){
                Question question = (Question)QstList.get(i);
        %>
        <%
            if(i%2==0){
        %>
        <tr style="background:antiquewhite">
                <%
                } else {
            %>
        <tr style="background: lavenderblush">
            <%
                }
            %>
            <td><%=question.getQuestionId()%></td>
            <td><%=question.getStyle()%></td>
            <td><%=question.getTitle()%></td>
            <td><%=question.getOptionA()%></td>
            <td><%=question.getOptionB()%></td>
            <td><%=question.getOptionC()%></td>
            <td><%=question.getOptionD()%></td>
            <td><%=question.getAnswer()%></td>

        <%
            String flag = (String) application.getAttribute("User");
            if("1".equals(flag)){
        %>
            <td>
                <a href="/myWeb/exam/delete?questionId=<%=question.getQuestionId()%>">删除试题</a>
            </td>
            <td>
                <a href="/myWeb/exam/FindById?questionId=<%=question.getQuestionId()%>">详细信息</a>
            </td>
        <%
            }
        %>
        </tr>
        <%
            }
        %>

    </table>
</center>
</body>
</html>
