<%--
  Created by IntelliJ IDEA.
  User: Heygo
  Date: 2021/3/8
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/quick12" method="post">
    <%-- 表明是第一个 User 对象的 username 和 age 属性 --%>
    <input type="text" name="userList[0].username"><br/>
    <input type="text" name="userList[0].age"><br/>
    <%-- 表明是第二个 User 对象的 username 和 age 属性 --%>
    <input type="text" name="userList[1].username"><br/>
    <input type="text" name="userList[1].age"><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
