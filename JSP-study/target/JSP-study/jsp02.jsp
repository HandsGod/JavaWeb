<%--
  Created by IntelliJ IDEA.
  User: hubeizhiwuren
  Date: 2021/9/14
  Time: 4:23 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    String name1 = (String) pageContext.findAttribute("name4");
%>
<h1><%=name1%></h1>
<h1>${pageContext.findAttribute("name2")}</h1>
<h1>${pageContext.findAttribute("name3")}</h1>
<h1>${pageContext.findAttribute("name4")}</h1>


</body>
</html>
