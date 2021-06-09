<%--
  Created by IntelliJ IDEA.
  User: 19871
  Date: 2021/6/9
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息维护</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/save" method="post">
    name:<input type="text" name="name"><br>
    age:<input type="text" name="age"><br>
    salary:<input type="text" name="salary"><br>
    <input type="submit" value="保存">
</form>
</body>
</html>
