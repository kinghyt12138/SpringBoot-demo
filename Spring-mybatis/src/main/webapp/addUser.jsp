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
<%--<form action="${pageContext.request.contextPath}/user/save" method="post">--%>
<%--    name:<input type="text" name="name"><br>--%>
<%--    age:<input type="text" name="age"><br>--%>
<%--    salary:<input type="text" name="salary"><br>--%>
<%--    <input type="submit" value="保存">--%>
<%--</form>--%>

<form id="userForm">
    name:<input type="text" name="name" id="username"><br>
    age:<input type="text" name="age" id="userage"><br>
    salary:<input type="text" name="salary" id="usersalary"><br>
    <input type="button" value="保存" id="btn">
</form>

<script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">

$("#btn").click(function () {
    <%--    json提交--%>
    <%--$.post("${pageContext.request.contextPath}/user2/save",--%>
    <%--    {"name":$("#username").val(),"age":$("input[name='age']").val(),"salary":$("#usersalary").val()},--%>
    <%--    function (data) {--%>
    <%--        console.log(data)--%>
    <%--        if(data){--%>
    <%--            window.location.href = "${pageContext.request.contextPath}/view/findAllList";--%>
    <%--        }--%>
    <%--    });--%>

    //form表单序列化 post的参数 url 对象 函数
    $.post("${pageContext.request.contextPath}/user2/save",
       $("#userForm").serialize(),
        function (data) {
            if(data){
                window.location.href = "${pageContext.request.contextPath}/view/findAllList";
            }
        }
    );
})
</script>
</body>
</html>
