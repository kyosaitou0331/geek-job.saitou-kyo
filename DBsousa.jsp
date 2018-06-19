<%-- 
    Document   : DBsousa
    Created on : 2018/06/13, 15:59:15
    Author     : owner
--%><%@page import="java.sql.*"%>


　
 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%
            Connection db_Challenge = null;
            try {
                  Class.forName("com.mysql.jdbc.Driver").newInstance();  
                  db_Challenge = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge", "today", "today03315378"); 
            } catch (Exception e_con) {
                  System.out.println(e_con.getMessage());
            
            
         
            %></h1>
    </body>
</html>
