<%--
  Created by IntelliJ IDEA.
  User: hubeizhiwuren
  Date: 2021/9/14
  Time: 11:26 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="JSTLCore.jsp" method="get">
    <%--<input type="text" value="${param.user}" name="us">--%>
    <input type="text" name="us">

    <input type="submit" value="login">
</form>
<c:if test="${param.us=='admin'}">
    <c:out value="welcome admin！！！"></c:out>
</c:if>
<c:out value="fuck you!">

</c:out>
</body>
</html>
