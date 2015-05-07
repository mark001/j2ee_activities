<%-- 
    Document   : profile
    Created on : May 6, 2015, 4:04:00 PM
    Author     : User
--%>
<% 
    response.setHeader("Cache-Control", "no-store, must revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", -1);
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LogIn Sample | PROFILE</title>
    </head>
    <body>
        <nav>
            <a href="home.jsp">Home</a>
            | <a href="profile.jsp">Profile</a>
            | <a href="Logout">Log Out</a>
        </nav>
        <h1>Hi <%=session.getAttribute("username")%>!</h1>
    </body>
</html>
