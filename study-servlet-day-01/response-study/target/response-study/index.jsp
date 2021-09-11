<html>
<body>
<%--${pageContext.request.contextPath}获取项目的路径--%>
<form action="${pageContext.request.contextPath}/login" method="get">
    <input type="text" name="username">
    <input type="text" name="password">
    <input type="submit">
</form>
</body>
</html>
