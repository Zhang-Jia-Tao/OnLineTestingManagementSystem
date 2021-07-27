<%@ page import="com.OEMS.demo.Users" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: zhangjiatao
  Date: 2021/7/12
  Time: 3:29 下午
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

        tr:hover {background-color:cadetblue;}
    </style>
</head>
<body>
    <table>
        <tr>
            <td>用户编号</td>
            <td>用户姓名</td>
            <td>用户密码</td>
            <td>用户性别</td>
            <td>用户邮箱</td>
            <td>操作</td>
        </tr>
        <%
            List<Users> users1 = (List<Users>) request.getAttribute("users");
            for(Users users:users1){
        %>
        <tr>
            <td><%=users.getUserid()%></td>
            <td><%=users.getUsername()%></td>
            <td><%=users.getPassword()%></td>
            <td><%=users.getSex()%></td>
            <td><%=users.getEmail()%></td>
            <td><a href="/myWeb/jsp/update_user.jsp?userid=<%=users.getUserid()%>&
                username=<%=users.getUsername()%>&password=<%=users.getPassword()%>
                &sex=<%=users.getSex()%>&email=<%=users.getEmail()%>" style="text-decoration: none">更新</a></td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>
