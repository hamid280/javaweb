<%--
  Created by IntelliJ IDEA.
  User: engha
  Date: 4/25/2018
  Time: 12:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>

    <h1>WElcome, please login</h1>

    <form action="/login" method="post">
        login-name: <input type="text" name="loginname" width="30"/>
        password: <input type="password" name="password" width="10"/>
        <input type="submit" value="login">
    </form>

    <p style="color: red"> ${errorMessage}</p>

</body>
</html>
