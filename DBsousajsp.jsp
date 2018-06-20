<%-- 
    Document   : DBsousa3
    Created on : 2018/06/20, 10:39:19
    Author     : owner
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%
             Connection db_co = null;
             PreparedStatement db_st = null;
             ResultSet db_data=null;
            try {
                  Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); 
                  db_co = DriverManager.getConnection("jdbc:mysql://localhost/challenge_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","today","today03315378");
               
                  db_st=db_co.prepareStatement("select * from profiles");
                  
                  db_data=db_st.executeQuery();
                  while(db_data.next()){
                   out.print("名前：" + db_data.getString("name") + "<br>");
                  }
                        db_co.close();
                  db_st.close();
                  db_data.close();
           
            }catch (Exception e_con) {
                  out.print(e_con);
          
            %></h1>
    </body>
</html>
