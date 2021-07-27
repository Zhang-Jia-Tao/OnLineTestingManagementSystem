
<%@ page import="com.OEMS.demo.Question" %>
<%@ page import="com.OEMS.demo.Users" %><%--
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
    <style>
        input[type=text] {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            box-sizing: border-box;
            border: 1px solid #555;
            outline: none;
        }

        input[type=text]:focus {
            background-color: lightblue;
        }

        tr:hover {background-color:lightskyblue;}
    </style>
</head>
<body>

<%
    String userid = request.getParameter("userid");
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String sex = request.getParameter("sex");
    String email = request.getParameter("email");
%>
<center>
    <form action="/myWeb/user/update" method="get">
        <table>
            <tr>
                <td>用户编号</td>
                <td><input type="text" name="userid" value="<%=userid%>" readonly/></td>
            </tr>
            <tr>
                <td>用户姓名</td>
                <td><input type="text" name="username" value="<%=username%>" readonly/></td>
            </tr>
            <tr>
                <td>用户邮箱</td>
                <td><input type="text" name="email" value="<%=email%>"/></td>
            </tr>
            <tr>
                <td>用户性别</td>
                <td><input type="text" name="sex" value="<%=sex%>"/></td>
            </tr>
            <tr>
                <td>用户密码</td>
                <td><input type="text" name="password" value="<%=password%>"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="更新用户信息"/></td>
                <td><input type="reset" name="reset"/></td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
