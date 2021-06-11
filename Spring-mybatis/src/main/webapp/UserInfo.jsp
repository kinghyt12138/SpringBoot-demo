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
<%--<form action="${pageContext.request.contextPath}/user/update" method="post">--%>
<%--    id:<input type="text" name="id" readonly value="${requestScope.userInfo.id}"><br>--%>
<%--    name:<input type="text" name="name" value="${requestScope.userInfo.name}"><br>--%>
<%--    age:<input type="text" name="age" value="${requestScope.userInfo.age}"><br>--%>
<%--    salary:<input type="text" name="salary" value="${requestScope.userInfo.salary}"><br>--%>
<%--    <input type="submit" value="保存">--%>

<form >
    id:<input type="text" name="id" readonly ><br>
    name:<input type="text" name="name" ><br>
    age:<input type="text" name="age" ><br>
    salary:<input type="text" name="salary"><br>
    <input type="button" value="保存" id="btn">
</form>

<script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
    //获取id 方式1 request作用域取值
    <%
    String userId = request.getParameter("id");%>
    <%--var uid = '<%=userId%>';--%>
    $.get(
    //方式2 jstl取值 param
        "${pageContext.request.contextPath}/user2/findById/${param.id}",
    <%--    "${pageContext.request.contextPath}/user2/findById/"+uid,--%>
        function (data) {
            console.log(data)
            //获取到对象 显示值
            $("input[name='id']").val(data.id);
            $("input[name='name']").val(data.name);
            $("input[name='age']").val(data.age);
            $("input[name='salary']").val(data.salary);
        }
    )
    $("#btn").click(function () {
        $.ajax({
            type:"patch",
            url:"${pageContext.request.contextPath}/user2/update",
            data:{"id":$("input[name='id']").val(),
                "name":$("input[name='name']").val(),
                "age":$("input[name='age']").val(),
                "salary":$("input[name='salary']").val()},
            datatype: 'json',
            success:function (data) {
                console.log(data)
                if(data){
                    window.location.href = "${pageContext.request.contextPath}/view/findAllList";
                }
            },
            error:function (data) {
                alert("更新失败")
            }
        })


        <%--$.post("${pageContext.request.contextPath}/user2/update",--%>
        <%--    {"id":$("input[name='id']").val(),"name":$("input[name='name']").val(),"age":$("input[name='age']").val(),"salary":$("input[name='salary']").val()},--%>
        <%--    function (data) {--%>
        <%--        console.log(data)--%>
        <%--        if(data){--%>
        <%--            window.location.href = "${pageContext.request.contextPath}/view/findAllList";--%>
        <%--        }--%>
        <%--    });--%>
    })
</script>
</body>
</html>
