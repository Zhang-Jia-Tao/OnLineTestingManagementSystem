<%--
  Created by IntelliJ IDEA.
  User: zhangjiatao
  Date: 2021/7/15
  Time: 4:24 下午
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

    <form action="/myWeb/exam/online_exam">
        <table>
            <tr>
                <td>请从以下科目中，选择要参加的科目考试</td>
            </tr>
            <tr>
                <td><input type="radio" name="style" value="Linux">Linux</td>

            </tr>
            <tr>
                <td><input type="radio" name="style" value="Math">高等数学</td>
            </tr>
            <tr>
                <td><input type="radio" name="style" value="English">大学英语</td>
            </tr>
            <tr>
                <td><input type="radio" name="style" value="Web">Web</td>
            </tr>
            <tr>
                <td><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form>

</body>
</html>
