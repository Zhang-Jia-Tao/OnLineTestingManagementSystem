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
    <center>
        <form action="/myWeb/exam/account_score">
            <table style="border-collapse:collapse;width:100%">
                <tr>
                    <td style="padding: 8px;text-align: left;border-bottom: 1px solid beige">试题编号</td>
                    <td style="padding: 8px;text-align: left;border-bottom: 1px solid beige">试题信息</td>
                    <td style="padding: 8px;text-align: left;border-bottom: 1px solid beige">A</td>
                    <td style="padding: 8px;text-align: left;border-bottom: 1px solid beige">B</td>
                    <td style="padding: 8px;text-align: left;border-bottom: 1px solid beige">C</td>
                    <td style="padding: 8px;text-align: left;border-bottom: 1px solid beige">D</td>
                    <td style="padding: 8px;text-align: left;border-bottom: 1px solid beige">答案</td>
                </tr>
                <%
                    List<Question> questions = (List<Question>) session.getAttribute("questions");
                    for(Question question:questions){
                %>
                <tr>
                    <td style="padding: 8px;text-align: left;border-bottom: 1px solid beige"><%=question.getQuestionId()%></td>
                    <td style="padding: 8px;text-align: left;border-bottom: 1px solid beige"><%=question.getTitle()%></td>
                    <td style="padding: 8px;text-align: left;border-bottom: 1px solid beige"><%=question.getOptionA()%></td>
                    <td style="padding: 8px;text-align: left;border-bottom: 1px solid beige"><%=question.getOptionB()%></td>
                    <td style="padding: 8px;text-align: left;border-bottom: 1px solid beige"><%=question.getOptionC()%></td>
                    <td style="padding: 8px;text-align: left;border-bottom: 1px solid beige"><%=question.getOptionD()%></td>
                    <td style="padding: 8px;text-align: left;border-bottom: 1px solid beige">
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
                    <td style="padding: 8px;text-align: left;border-bottom: 1px solid beige"><input type="submit" value="提交试卷"></td>
                    <td style="padding: 8px;text-align: left;border-bottom: 1px solid beige"><input type="reset" value="重新考试"></td>
                </tr>
            </table>
        </form>
    </center>

</body>
</html>
