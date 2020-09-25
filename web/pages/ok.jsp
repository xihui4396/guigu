<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/30
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        请求成功！
        reqkey1=>${requestScope.reqKey1}
        reqkey2=>${requestScope.reqKey2}

        sessionkey1=>${sessionScope.sessionKey1}<br>
        sessionkey2=>${sessionScope.sessionKey2}<br>

        servletContextKey1=>${applicationScope.servletContextKey1}<br>
        servletContextKey2=>${applicationScope.servletContextKey2}<br>




</body>
</html>
