<%--
  Created by IntelliJ IDEA.
  User: hubeizhiwuren
  Date: 2021/9/14
  Time: 10:50 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<%--请求转发&&传参--%>
<jsp:forward page="JSPtag02.jsp">
    <jsp:param name="user" value="admin"/>
    <jsp:param name="pass" value="qwer98kr"/>
</jsp:forward>

</body>
</html>
