<%@ page import="java.util.List" %>
<%@ page import="com.OEMS.demo.Question" %><%--
  Created by IntelliJ IDEA.
  User: zhangjiatao
  Date: 2021/7/1
  Time: 8:50 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <center>
        <form action="/myWeb/exam/account_score">
            <table>
                <tr>
                    <td>试题编号</td>
                    <td>试题信息</td>
                    <td>A</td>
                    <td>B</td>
                    <td>C</td>
                    <td>D</td>
                    <td>答案</td>
                </tr>
                <%
                    List<Question> questions = (List<Question>) session.getAttribute("questions");
                    for(Question question:questions){
                %>
                <tr>
                    <td><%=question.getQuestionId()%></td>
                    <td><%=question.getTitle()%></td>
                    <td><%=question.getOptionA()%></td>
                    <td><%=question.getOptionB()%></td>
                    <td><%=question.getOptionC()%></td>
                    <td><%=question.getOptionD()%></td>
                    <td>
                        <input type="radio" name="answer_<%=question.getQuestionId()%>" value="A">A</input>
                        <input type="radio" name="answer_<%=question.getQuestionId()%>" value="B">B</input>
                        <input type="radio" name="answer_<%=question.getQuestionId()%>" value="C">C</input>
                        <input type="radio" name="answer_<%=question.getQuestionId()%>" value="D">D</input>
                    </td>
                </tr>
                <%
                    }
                %>
                <tr >
                    <td><input type="submit" value="submit"></td>
                    <td><input type="reset" value="reset"></td>
                </tr>
            </table>
        </form>
    </center>

</body>
</html>
