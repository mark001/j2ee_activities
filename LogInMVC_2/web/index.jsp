<%-- 
    Document   : index
    Created on : May 7, 2015, 9:39:34 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>LogIn Sample | Login-in</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form method="POST" action="Login">
            Username: <input type="text" name="username"/>
            Password: <input type="password" name="password"/>
            <input type="submit" value="Sign-in"/>
        </form>
    </body>
</html>