<%-- 
    Document   : swith文課題
    Created on : 2018/04/03, 16:18:06
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
        int num=13;
        switch(num){
         case 1:
               out.print("one");
               break;
         case 2:
               out.print("two");
               break;
         default:
               out.print("想定外");
               break;
         }
          %></h1>
    </body>
</html>
