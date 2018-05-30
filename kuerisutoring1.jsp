<%-- 
    Document   : kuerisutoring1
    Created on : 2018/05/30, 13:40:11
    Author     : owner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><%
      request.setCharacterEncoding("UTF-8");
     int data=Integer.parseInt(request.getParameter("total"));
     if(data>=5000){
         out.print(data%5);
     }else if((3000<=data)&&(data<5000)){
          out.print(data%4);
     }else{
          out.print(data);
     }                 
     out.print(request.getParameter("count"));
     out.print(request.getParameter("box"));            
    %>    
    </body>
</html>
