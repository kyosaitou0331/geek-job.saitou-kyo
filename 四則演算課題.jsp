<%-- 
    Document   : 四則演算課題
    Created on : 2018/04/03, 10:16:31
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
         int num1=20;
        int num2=30;
        int test=num1*num2;
        out.print(test);
        %></h1>
    </body>
</html>
