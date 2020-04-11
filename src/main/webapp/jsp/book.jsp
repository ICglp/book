<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>网上后台管理系统</title>
</head>
<style>
    .div1{
        border: 1px solid orange;
        border-radius: 15px;
    }
    .div2{
        width: 1200px;
        height: 150px;
    }
    .div3{
        width: 1200px;
        height: 80px;
    }
    .div4{
        width: 1200px;
        height: 400px;
    }
    .div5{
        width: 600px;
        height: 400px;
        float: left;
        border-right: 2px solid #FFA500;
    }
    .div6{
        width: 600px;
        height: 400px;
    }
</style>
<body>
<div class="div1" style="width: 1200px; height: 700px;  margin:  0 auto; border-left-width: thick;">
    <div class="div2">
        <h1 align="center">--网上后台管理系统</h1><br>
        <h4 align="right">${sessionScope.name},你好！<a href="/admin/logout">退出</a> </h4>
    </div>
    <div class="div3" align="center" style="background-color: orange;">
        <table style="border: 2px antiquewhite; background-color: orange;">
            <tbody><a href="">首页</a></tbody>!--<tbody><a href="">图书分类管理</a></tbody>!--
            <tbody><a href="">图书管理</a></tbody>!--<tbody><a href="">购书订单管理</a>!--</tbody>
        </table>
        <div class="div4">
            <div class="div5">
                <h3 style="padding-right: 240px; padding-top: 60px;" >图书分类信息</h3>
                <table style="" border="2px ;" bordercolor="#FFA500" class="t1">
                    <tr style="background-color: #FFA500;"><td>书名</td><td>作者</td><td>类型</td><td>价格</td><td>操作</td></tr>
                    <tr><td>红楼梦</td><td>曹雪芹</td><td>古典文学</td><td>88.0</td><td><a href="#">修改</a>|<a href="#">删除</a></td></tr>
                    <tr><td>红楼梦</td><td>曹雪芹</td><td>古典文学</td><td>88.0</td><td><a href="#">修改</a>|<a href="#">删除</a></td></tr>
                    <tr><td>红楼梦</td><td>曹雪芹</td><td>古典文学</td><td>88.0</td><td><a href="#">修改</a>|<a href="#">删除</a></td></tr>
                </table>
            </div>
            <div class="div6">
                <h3 style="padding-top: 60px;">添加图书信息</h3>
                <form action="" method="post">
                    <label>图书书名：</label><input type="text" width="80px;" /><br>
                    <label>图书作者：</label><input type="text" width="80px;" /><br>
                    <label>图书分类：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <select>
                            <option value="volvo">古典文学</option>
                            <option value="saab">娱乐书籍</option>
                            <option value="opel">国外文学</option>
                            <option value="audi">科学书籍</option>
                        </select>&nbsp;&nbsp;&nbsp;<br>
                        <label>图书价格：</label><input type="text" width="80px;" /><br>
                        <label>出版社：&nbsp;&nbsp;&nbsp;</label><input type="text" width="80px;" /><br>
                        <button type="submit">提交</button>
                </form>
            </div>
        </div>

    </div>
</div>
</body>
</html>

