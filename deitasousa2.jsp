<%-- 
    Document   : deitasousa2
    Created on : 2018/05/29, 10:56:54
    Author     : owner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%
            request.setCharacterEncoding("UTF-8");
            out.print(request.getParameter("txtName"));
            out.print(request.getParameter("rdoSample"));
            out.print(request.getParameter("mulText"));
            %></h1>
    </body>
</html>
