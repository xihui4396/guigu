<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/30
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <a href="${pageContext.request.contextPath}/hello">hello</a>
  <%--<a href="http://localhost:8080/mvc_day01/hello">hello</a>--%>

  <form action="${pageContext.request.contextPath}/post" method="post">
    <input type="submit" value="提交">
  </form>

  <form method="get" action="${pageContext.request.contextPath}/param6">
    用户id:<input type="text" name="id"/><br>
    用户姓名:<input type="text" name="name"/><br>
    用户手机号:<input type="text" name="phone"/><br>
    用户年龄:<input type="text" name="age"/><br>
    用户的车:<input type="text" name="car.type"/><br>
    用户的车牌号:<input type="text" name="car.carNo"/><br>

    <input type="submit" value="send">


  </form>
  </body>
</html>
