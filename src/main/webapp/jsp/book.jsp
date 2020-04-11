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
            <tbody><a href="/jsp/index.jsp">首页</a></tbody>!--<tbody><a href="/jsp/index.jsp">图书分类管理</a></tbody>!--
            <tbody><a href="/jsp/book.jsp">图书管理</a></tbody>!--<tbody><a href="">购书订单管理</a>!--</tbody>
        </table>
        <div class="div4">
            <div class="div5">
                <h3 style="padding-right: 240px; padding-top: 60px;" >图书分类信息</h3>
                <table style="" border="2px ;" bordercolor="#FFA500" class="t1" id="tab">
                    <tr style="background-color: #FFA500;"><td>书名</td><td>作者</td><td>类型</td><td>价格</td><td>操作</td></tr>
                </table>
            </div>
            <div class="div6">
                <h3 style="padding-top: 60px;">添加图书信息</h3>
                <form action="/book/add" method="post" enctype="multipart/form-data">
                    <label>图书书名：</label><input name="BTitle" type="text" width="80px;" /><br>
                    <label>图书作者：</label><input name="BAuthor" type="text" width="80px;" /><br>
                    <label>图书分类：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                        <select id="category" name="BCategoryID">

                        </select>&nbsp;&nbsp;&nbsp;<br>
                        <label>图书价格：</label><input name="BPrice" type="text" width="80px;" /><br>
                        <label>出版社：&nbsp;&nbsp;&nbsp;</label><input name="BPublisher" type="text" width="80px;" /><br>
                        <div style="display: flex;position: relative;padding: 5px 0"><span style="position: absolute;top: 5px;left: 20px">图片：&nbsp;&nbsp;&nbsp;</span><span style="margin-left: 80px"><input name="file" type="file" width="80px;" /></span></div>
                        <button style="margin-top: 10px" type="submit">提交</button>
                </form>
            </div>
        </div>

    </div>
</div>
</body>
</html>
<script src="/js/jq.js"/>
<script>
</script>
</html>
<script>
    $.ajax({
        type: "get",
        url: "/book/findAll",
        success: function (res) {
            for (var i = 0; i < res.length; i++) {
                console.log(res)
                $("#tab").append("<tr><td>"+res[i].btitle+"</td><td>"+res[i].bauthor+"</td><td>"+res[i].bcategoryID+"</td><td>"+res[i].bprice+"</td><td><a href='/book/findByID?id="+res[i].bid+"'>修改</a>|<a href='#'>删除</a></td></tr>")
            }
        }
    });
    $.ajax({
        type: "get",
        url: "/categoty/findAll",
        success: function (res) {
            for (var i = 0; i < res.length; i++) {
                $("#category").append("<option value='"+res[i].cid+"'>"+res[i].cname+"</option>")
            }
        }
    })

</script>
