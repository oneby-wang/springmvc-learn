<%--
  Created by IntelliJ IDEA.
  User: Heygo
  Date: 2021/3/8
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script>
        var userList = new Array();
        userList.push({username:"Oneby",age:21});
        userList.push({username:"Heygo",age:21});

        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/quick13",
            data:JSON.stringify(userList),
            contentType:"application/json;charset=utf-8"
        });

    </script>
</head>
<body>

</body>
</html>

