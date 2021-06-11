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
<%--<c:forEach items="${requestScope.userList}" var="user">--%>
<%--    id:${user.id} name:${user.name} age:${user.age} salary:${user.salary}--%>
<%--    <a href="${pageContext.request.contextPath}/user/findById?id=${user.id}" >修改</a>--%>
<%--    <a href="${pageContext.request.contextPath}/user/delete?id=${user.id}">删除</a>--%>
<%--    <br>--%>
<%--</c:forEach>--%>
<%--<a href="${pageContext.request.contextPath}/addUser.jsp" >添加</a>--%>


<div id="userDiv">
<%--    --%>
    <div id="userData" style="display: none">
        <span>#ID#</span>  <span>#NAME#</span>  <span>#AGE#</span>  <span>#SALARY#</span>
        <a href="${pageContext.request.contextPath}/view/userInfo?id=#ID#">修改</a>
<%--        <a href="${pageContext.request.contextPath}/user2/delete?id=#ID#" >删除</a>--%>
        <a href="${pageContext.request.contextPath}/user2/delete/#ID#" >删除</a>
        <br>
    </div>
</div>

<%--要改--%>
<a href="${pageContext.request.contextPath}/view/save" >添加</a>

<script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
<%--    需要的是一个对象 参数也是对象的--%>
    $.ajax({
        type:'get',
        url:'${pageContext.request.contextPath}/user2/findAllList',
        data:'',
        datatype:'json',
        success:function (data) {
            console.log("成功！==",data);
            if(data.length>0){
                for(var i = 0,l=data.length;i<l;i++){
                    $("#userDiv").append(
                        $("#userData").html()
                        .replace("#ID#",data[i].id)
                        .replace("#NAME#",data[i].name)
                        .replace("#AGE#",data[i].age)
                        .replace("#SALARY#",data[i].salary)
                        .replace("#ID#",data[i].id)
                            .replace("#ID#",data[i].id)
                    );
                }
            }
        },
        error:function (data) {
            console.log(data);
        }
        }
    )

</script>
</body>
</html>
