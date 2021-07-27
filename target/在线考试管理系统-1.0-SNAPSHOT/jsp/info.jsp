<%--
  Created by IntelliJ IDEA.
  User: zhangjiatao
  Date: 2021/6/30
  Time: 9:08 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <%
        String res = (String)request.getAttribute("info");
    %>
    <font style="color:lightskyblue;font-size:40px">
        <%=res%>
    </font>
    <br/><br/>
    <%
        String flag = (String)request.getAttribute("flag");
        if("1".equals(flag)){
    %>
        <font style="color:#578bc3;font-size: 40px">你可以继续添加试题</font><br/>
        <font style="font-size: 30px;color:#578bc3"><a href="/myWeb/html/Add_Exam.html">继续添加</a></font>
    <%
        }
    %>

</center>
</body>
</html>
