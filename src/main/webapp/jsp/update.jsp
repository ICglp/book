<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<>
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
    </div>
        <div class="div4">
            <div class="div5">
                <h3 style="padding-top: 60px;">修改图书信息</h3>
                <form action="/book/update?Bid=${requestScope.book.bid}&&BPhoto=${requestScope.book.BPhoto}" method="post" enctype="multipart/form-data">
                    <label>图书书名：</label><input name="BTitle" type="text" width="80px;" value="${requestScope.book.BTitle}" /><br>
                    <label>图书作者：</label><input name="BAuthor" value="${requestScope.book.BAuthor}" type="text" width="80px;" /><br>
                    <label>图书分类：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <select id="category" name="BCategoryID">
                            <option  value="${requestScope.book.cateGoty.cid}">${requestScope.book.cateGoty.cname}</option>
                            <c:forEach items="${cateGotyList}" var="cate">
                                <c:if test="${cate.cname != requestScope.book.cateGoty.cname}">
                                    <option value="${cate.cid}">${cate.cname}</option>
                                </c:if>
                            </c:forEach>
                        </select>&nbsp;&nbsp;&nbsp;<br>
                        <label>图书价格：</label><input name="BPrice" value="${requestScope.book.BPrice}" type="text" width="80px;" /><br>
                        <label>出版社：&nbsp;&nbsp;&nbsp;</label><input name="BPublisher" value="${requestScope.book.BPublisher}" type="text" width="80px;" /><br>
                        <label>当前图片：&nbsp;&nbsp;&nbsp;</label><img src="/imgs/${requestScope.book.BPhoto}" height="50px" width="100px"><br>
                        <div style="display: flex;position: relative;padding: 5px 0"><span style="position: absolute;top: 5px;left: 20px">图片：&nbsp;&nbsp;&nbsp;</span><span style="margin-left: 80px"><input name="file" type="file" width="80px;" accept="image/*"/></span></div>
                        <button type="submit">提交</button>
                    </label>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>

