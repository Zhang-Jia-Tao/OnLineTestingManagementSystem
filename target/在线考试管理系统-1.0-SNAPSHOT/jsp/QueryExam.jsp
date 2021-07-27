
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
</head>
<body>
<center>
    <table>
        <tr style="align-content:center">
            <td>题目编号</td>
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
        <tr style="background: green">
                <%
                } else {
            %>
        <tr style="background: yellow">
            <%
                }
            %>
            <td><%=question.getQuestionId()%></td>
            <td><%=question.getTitle()%></td>
            <td><%=question.getOptionA()%></td>
            <td><%=question.getOptionB()%></td>
            <td><%=question.getOptionC()%></td>
            <td><%=question.getOptionD()%></td>
            <td><%=question.getAnswer()%></td>

            <td>
                <a href="/myWeb/exam/delete?questionId=<%=question.getQuestionId()%>">删除试题</a>
            </td>
            <td>
                <a href="/myWeb/exam/FindById?questionId=<%=question.getQuestionId()%>">详细信息</a>
            </td>
        </tr>
        <%
            }
        %>

    </table>
</center>
</body>
</html>
