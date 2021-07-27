<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Title</title>
    <link rel="stylesheet" href="../css/login.css">
</head>
<body background="/images/img.jpeg">
<%
    request.setCharacterEncoding("utf-8");
    response.setContentType("utf-8");
%>
<div id="login-box">
    <h1 style="color:darkred">密码错误请重新输入</h1>
    <form action="/myWeb/login">
        <div class="form">
            <div class="item">
                <i class="fa fa-user-circle-o" aria-hidden="true"></i>
                <input type="text" placeholder="Username" name="username">
            </div>
            <div class="item">
                <i class="fa fa-key" aria-hidden="true"></i>
                <input type="text" placeholder="Password" name="password">
            </div>
        </div>
        <button type="submit">Login</button>
    </form>

    <br/><br/><br/>
    <div class="bottom">
        <label style="color:white">© 山东科技大学 经济管理学院 ｜ 电子商务 00110010</label>
    </div>
</div>
</body>
</html>