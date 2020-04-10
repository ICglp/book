<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
        <!--<h4 style="font-family: "arial black";" align="right">张三|<a href="${loginout}">退出登录</a></h4>-->
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
                <table style="" border="1px;" id="tab">
                    <tr style="background-color: #FFA500;"><td >图书分类</td><td>操作</td></tr>
                    <c:forEach items="${list}" var="cate">
                        <tr>
                            <td>${cate.cname}</td>
                            <td><a href="/categoty/delete?Cid=${cate.id}">删除</a></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
            <div class="div6">
                <h3 style="padding-top: 60px;">添加信息分类</h3>
                <form action="/categoty/add" method="post">
                    <label>分类名称：</label><input type="text" width="80px;" name="catename" />	<button type="submit">保存</button>
                </form>

            </div>
        </div>

    </div>
</div>
</body>
<script src="/js/jq.js"/>
    <script type="text/javascript">
    $.ajax({
        type:"get",
        url:"/categoty/findAll",
        success: function (res) {
            for (var i=0;i<res.length;i++){
                $('tab').open("")
            }
        }
    })
    </script>
</html>

