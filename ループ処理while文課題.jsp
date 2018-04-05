<%-- 
    Document   : ループ処理while文課題
    Created on : 2018/04/05, 10:41:39
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
        int key=1000;
        while(key >100){
        out.print(key);
        key /=2;
        }
         %></h1>
    </body>
</html>
