<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: engha
  Date: 4/20/2018
  Time: 11:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Web app tutorial</title>
  </head>
  <body>

    <h1>Hello world</h1>


    <%
      Date date = new Date();
      out.print("<h2>" + date.toString() + "<h2>");

    %>
  </body>
</html>
