<%--
  Created by IntelliJ IDEA.
  User: 维吉的笔记本
  Date: 2018/3/17
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>添加图书</h1>
<form action="/BooknewServlet" method="post">
    图书名称：<input name="bookname"/>
    图书作者：<input name="bookauthor"/>
    图书价格：<input name="bookprice"/>
    <input type="submit" value="添加"/>
</form>



</body>
</html>
