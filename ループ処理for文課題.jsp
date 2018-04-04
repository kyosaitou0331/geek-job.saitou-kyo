<%-- 
    Document   : ループ処理for文課題
    Created on : 2018/04/04, 15:42:33
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
        for(int i=1;i<=20;i++){
        out.print(8*i);
        }     
        %></h1>
    </body>
</html>
