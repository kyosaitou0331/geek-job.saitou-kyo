<%-- 
    Document   : ループ処理for文課題３
    Created on : 2018/04/04, 16:30:01
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
        int result=0;
        for(int i=100;i>=0;i--){
        result+=i;
        } 
        out.print(result);
        %></h1>
    </body>
</html>
