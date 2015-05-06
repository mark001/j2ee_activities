<%-- 
    Document   : profile
    Created on : May 6, 2015, 4:04:00 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <nav>
            <a href="home.jsp">Home</a>
            <a href="profile.jsp">Profile</a>
        </nav>
        <h1>Hi <%=session.getAttribute("username")%>!</h1>
    </body>
</html>
