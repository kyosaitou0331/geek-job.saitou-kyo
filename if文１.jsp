<%-- 
    Document   : if文１
    Created on : 2018/04/03, 14:13:12
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
        int num=(2);
        if(num==1){
            out.print("1です!");
        }else if(num==2){
           out.print("プログラミングキャンプ!");
        }else {
           out.print("その他!");
        }    
        %></h1>
    </body>
</html>
