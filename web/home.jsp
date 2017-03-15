<%--
  Created by IntelliJ IDEA.
  User: wergin
  Date: 04-Mar-17
  Time: 02:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <%
        if (session.getAttribute("emailLogin") == null)
            response.sendRedirect("index.jsp");
    %>
    welcome ${emailLogin}
     <form action="Logout">
        <input type="submit" value="Logout">
    </form>
</body>
</html>
