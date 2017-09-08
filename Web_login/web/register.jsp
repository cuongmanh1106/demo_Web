<%-- 
    Document   : register
    Created on : Sep 7, 2017, 9:27:03 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% 
        if(session.getAttribute("ten")==null)
        {
            response.sendRedirect("index.jsp");
        }
        %>
        Welcome ${ten}
    </body>
</html>
