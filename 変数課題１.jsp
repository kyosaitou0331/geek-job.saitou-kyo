<%-- 
    Document   : 変数課題１
    Created on : 2018/03/27, 15:47:16
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
        String text="初めまして";
        text +="齊藤京です！";
        text +="趣味はスノーボードです！";
        out.print(text);
        %></h1>
    </body>
</html>
