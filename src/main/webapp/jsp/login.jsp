<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <title>网上后台管理系统</title>
</head>
<body>
<h1 align="center">网上后台管理系统</h1>
<div align="center" style="margin: 5%;">
    <form action="/admin/login" method="post">
        <label>登录账号：</label>
        <input type="text" name="AloginID" value="${cookie.remebername.value}"/><br />
        <label>登录密码：</label>
        <input type="password" name="AloginPsw" value="${cookie.remeberpwd.value}"/><br />
        <input type="checkbox" name="cb" value="1" id="b"/>记住账号和密码<br />
        <button type="submit" >登录</button>
    </form>
</div>
</body>
</html>