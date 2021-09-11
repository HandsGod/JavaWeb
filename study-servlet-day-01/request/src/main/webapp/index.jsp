<%--
  Created by IntelliJ IDEA.
  User: hubeizhiwuren
  Date: 2021/9/11
  Time: 5:24 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <form action="${pageContext.request.contextPath}/login" method="post">
        同户名：<input type="text" name="username"><br>
        密码：<input type="password" name="passeord"><br>
        爱好 <input type="checkbox" name="hobbys" value="足球1">足球1
        <input type="checkbox" name="hobbys" value="足球2">足球2
        <input type="checkbox" name="hobbys" value="足球3">足球3
        <input type="checkbox" name="hobbys" value="足球4">足球4
        <br>
        <input type="submit">
    </form>
</head>
<body>

</body>
</html>
