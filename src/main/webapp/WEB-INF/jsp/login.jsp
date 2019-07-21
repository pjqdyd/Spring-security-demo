<%--
  Created by IntelliJ IDEA.
  User: Z2
  Date: 2019/7/21
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h2>登录</h2>

<form action="${pageContext.request.contextPath}/login" method="post">
    用户名: <input type="text" name="username" /><br/>
    密码:<input type="password" name="password"><br/>
    <button type="submit">提交</button><br/>
</form>
</body>
</html>
