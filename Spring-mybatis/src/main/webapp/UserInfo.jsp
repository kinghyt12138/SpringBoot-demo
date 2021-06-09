<%--
  Created by IntelliJ IDEA.
  User: 19871
  Date: 2021/6/9
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户详细页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/update" method="post">
    id:<input type="text" name="id" readonly value="${requestScope.userInfo.id}"><br>
    name:<input type="text" name="name" value="${requestScope.userInfo.name}"><br>
    age:<input type="text" name="age" value="${requestScope.userInfo.age}"><br>
    salary:<input type="text" name="salary" value="${requestScope.userInfo.salary}"><br>
    <input type="submit" value="保存">
</form>
</body>
</html>
