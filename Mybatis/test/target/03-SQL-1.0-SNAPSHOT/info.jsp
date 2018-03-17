<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 维吉的笔记本
  Date: 2018/3/1
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>Title</title>



</head>

<style type="text/css">

    td{ text-align: center }

</style>

<body>
<div align="center">
    <table border="1px solid" width="700px" height="300px">


        <tr>
            <td>编号</td>
                <td>标题</td>
            <td>访问量</td>
            <td>评论数</td>
        </tr>
        <c:forEach items="${news}" var="temp">

            <tr>

                <td>${temp.id}</td>
                <td><a href="/twoServlet?pp=look&uid=${temp.id}"> ${temp.bt}</a></td>
                <td>${temp.fw}</td>
<td>${temp.pl}</td>
            </tr>


        </c:forEach>


    </table>

    <div class="pages">
    <c:if test="${page.totalPage>1}">
        <a href="/oneServlet?${url}&currentPage=1" >首页</a>
        <c:if test="${page.currentPage>1}">
            <a href="/oneServlet?${url}&currentPage=${page.currentPage -1 }" >上一页</a>
        </c:if>
        <c:forEach  var="temp" begin="${page.currentPage>3?page.currentPage-3:1}" end="${page.totalPage-page.currentPage>3?page.currentPage+3:page.totalPage}" step="1">
            <c:if test="${page.currentPage==temp}">
                <a href="/oneServlet?${url}&currentPage=${temp}" >${temp}</a>
            </c:if>
            <c:if test="${page.currentPage!=temp}">
                <a href="/oneServlet?${url}&currentPage=${temp}">${temp}</a>
            </c:if>
        </c:forEach>
        <c:if test="${page.currentPage<page.totalPage}">
            <a href="/oneServlet?${url}&currentPage=${page.currentPage+1}" >下一页</a>
        </c:if>
        <a href="/oneServlet?${url}&currentPage=${page.totalPage}" >尾页</a>
    </c:if>
    <c:if test="${page.totalPage==0}">
        暂无记录
    </c:if>
</div>
</div>
</body>
</html>
