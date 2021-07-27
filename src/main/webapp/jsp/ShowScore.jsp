<%@ page import="com.OEMS.demo.Score" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: zhangjiatao
  Date: 2021/7/15
  Time: 3:48 下午
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
<body>
    <table>
        <tr>
            <td>用户名</td>
            <td>科目</td>
            <td>分数</td>
        </tr>
        <%
            List<Score> scores = (List<Score>) request.getAttribute("score");
            for(Score score:scores){
        %>
        <tr>
            <td><%=score.getUsername()%></td>
            <td><%=score.getStyle()%></td>
            <td><%=score.getScore()%></td>
        </tr>
        <%
            }
        %>
    </table>


</body>
</html>
