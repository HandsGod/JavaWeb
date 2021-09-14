<%--
  Created by IntelliJ IDEA.
  User: hubeizhiwuren
  Date: 2021/9/14
  Time: 4:10 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("name1","zhangsan1");//保存的数据只在一个页面中有效
    request.setAttribute("name2","zhangsan2");//保存的数据只在一个请求中有效
    session.setAttribute("name3","zhangsan3");//保存的数据在一次会话中有效
    application.setAttribute("name4","zhangsan4");//保存的数据在服务器中有效

%>


<h3>${name1}</h3>
<h3>${name2}</h3>
<h3>${name4}</h3>

</body>
</html>
