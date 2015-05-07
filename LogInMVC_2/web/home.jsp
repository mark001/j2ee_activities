<%-- 
    Document   : home
    Created on : May 6, 2015, 3:24:53 PM
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    response.setHeader("Cache-Control", "no-store, must revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", -1);
%>    
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LogIn Sample | HOME</title>
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