<%--
  Created by IntelliJ IDEA.
  User: zhangjiatao
  Date: 2021/7/8
  Time: 11:20 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body background="/images/img4.webp">
<ul>
    <%
        String flag = (String) application.getAttribute("User");
        if("1".equals(flag)){  //1:管理员  0：用户
    %>
    <li>用户信息管理
        <ol>
            <li><a href="/myWeb/html/User.html" target="right" style="text-decoration:none;color:lightskyblue;font-family:宋体">用户信息注册</a></li>
            <li><a href="/myWeb/user/query" target="right" style="text-decoration: none;color:lightskyblue;font-family:宋体">用户信息查询</a></li>
        </ol>
    </li>
    <li>试题信息管理
        <ol>
            <li><a href="/myWeb/html/Add_Exam.html" target="right" style="text-decoration:none;color:lightskyblue;font-family:宋体">添加试题</a></li>
            <li><a href="/myWeb/exam/query" target="right" style="text-decoration:none;color:lightskyblue;font-family:宋体">查询试题</a></li>
        </ol>
    </li>
    <li>学生成绩管理
        <ol>
            <li><a href="/myWeb/score/query" target="right" style="text-decoration:none;color:lightskyblue;font-family:宋体">查询学生分数</a> </li>
        </ol>
    </li>
    <%
        }
        //1:管理员  0：用户
        if("0".equals(flag)){
    %>
    <li>试题信息管理
        <ol>
            <li><a href="/myWeb/exam/query" target="right" style="text-decoration:none;color:lightskyblue;font-family:宋体">查询试题</a></li>
        </ol>
    </li>
    <li>考试管理
        <ol>
            <li><a href="/myWeb/jsp/choose_sub.jsp" target="right" style="text-decoration:none;color:lightskyblue;font-family:宋体">参加考试</a></li>
            <li><a href="/myWeb/jsp/search.jsp" target="right" style="text-decoration:none;color:lightskyblue;font-family:宋体">成绩查询</a></li>
        </ol>
    </li>
    <%
        }
    %>
</ul>
</body>
</html>
