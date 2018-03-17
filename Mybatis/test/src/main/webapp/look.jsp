<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 维吉的笔记本
  Date: 2018/3/1
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<form  action="/twoServlet?pp=ty&uid=${use.newsid}" method="post">
<div align="center">
<h1>内容</h1>
<h3><span style="color: blanchedalmond"> ${use.newsContent}</span></h3>

<table border="solid" align="center">
<c:forEach items="${talk}" var="temp">

    <tr>
        <td>${temp.talktme}</td>
    </tr>
    <tr>
        <td>${temp.content}</td>
    </tr>

</c:forEach>
</table>
    <textarea name="tt"></textarea>
   <input type="submit" value="提交评论">
</div>
</form>
</body>
</html>
