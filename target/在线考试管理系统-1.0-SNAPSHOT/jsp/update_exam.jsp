
<%@ page import="com.OEMS.demo.Question" %><%--
  Created by IntelliJ IDEA.
  User: zhangjiatao
  Date: 2021/5/18
  Time: 11:51 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    Question qst = (Question)request.getAttribute("update");
%>
<center>
    <form action="/myWeb/question/update" method="get">
        <table border="2">
            <tr>
                <td>题目编号：</td>
                <td><input type="text" name="questionId" value="<%=qst.getQuestionId()%>" readonly/></td>
            </tr>
            <tr>
                <td>题目：</td>
                <td><input type="text" name="title" value="<%=qst.getTitle()%>"/></td>
            </tr>
            <tr>
                <td>A：</td>
                <td><input type="text" name="optionA" value="<%=qst.getOptionA()%>"/></td>
            </tr>
            <tr>
                <td>B：</td>
                <td><input type="text" name="optionB" value="<%=qst.getOptionB()%>"/></td>
            </tr>
            <tr>
                <td>C：</td>
                <td><input type="text" name="optionC" value="<%=qst.getOptionC()%>"/></td>
            </tr>
            <tr>
                <td>D：</td>
                <td><input type="text" name="optionD" value="<%=qst.getOptionD()%>"/></td>
            </tr>
            <tr>
                <td>正确答案：</td>
                <td>
                    <input type="radio" name="answer" value="A" <%="A".equals(qst.getAnswer())?"checked":""%>>A
                    <input type="radio" name="answer" value="B" <%="B".equals(qst.getAnswer())?"checked":""%>>B
                    <input type="radio" name="answer" value="C" <%="C".equals(qst.getAnswer())?"checked":""%>>C
                    <input type="radio" name="answer" value="D" <%="D".equals(qst.getAnswer())?"checked":""%>>D
                </td>
            </tr>
            <tr>
                <td><input type="submit" value="更新试题"/></td>
                <td><input type="reset" name="reset"/></td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
