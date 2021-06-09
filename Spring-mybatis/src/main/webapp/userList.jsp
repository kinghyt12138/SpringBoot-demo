<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 19871
  Date: 2021/6/9
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<c:forEach items="${requestScope.userList}" var="user">
    id:${user.id} name:${user.name} age:${user.age} salary:${user.salary}
    <a href="${pageContext.request.contextPath}/user/findById?id=${user.id}" >修改</a>
    <a href="${pageContext.request.contextPath}/user/delete?id=${user.id}">删除</a>
    <br>
</c:forEach>
<a href="${pageContext.request.contextPath}/addUser.jsp" >添加</a>
</body>
</html>
