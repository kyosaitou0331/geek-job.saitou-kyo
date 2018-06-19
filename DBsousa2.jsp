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
             PreparedStatement db_st = null;
             ResultSet db_data=null;
            try {
                  Class.forName("com.mysql.jdbc.Driver").newInstance();  
                  db_Challenge = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge", "today", "today03315378");
               
                  db_st=db_Challenge.prepareStatement("INSERT INTO profiles (profilesID,name,tel,age,birthday) VALUES (6,'田中　剛','123-456-7890',30,'2000-01-20')");
                  
                  db_st.executeUpdate();
                  while(db_data.next()){
                   out.print("名前：" + db_data.getString("name") + "<br>");
                  }
            } catch (Exception e_con) {
                  System.out.println(e_con.getMessage());
            }finally{
                  db_Challenge.close();
            }
            
         
            %></h1>
    </body>
</html>
