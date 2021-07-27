<%--
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
</head>
<body>
    <%
        HttpSession httpSession = request.getSession(false);
        ServletContext context = request.getServletContext();
        Integer score = (Integer)httpSession.getAttribute("score");
        String username = (String) context.getAttribute("username");
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
