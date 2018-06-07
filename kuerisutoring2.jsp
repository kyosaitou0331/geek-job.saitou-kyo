<%-- 
    Document   : kuerisutoring2
    Created on : 2018/05/30, 16:37:23
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
     int data1=Integer.parseInt(request.getParameter("math1"));
     int data2=Integer.parseInt(request.getParameter("math2"));
     int data3=Integer.parseInt(request.getParameter("math3"));
     int i=2;
     out.println(data1+"=");
     while(data1!=1){
         if(data1%i==0){           
          out.println(i+"*");
          data1/=i;
         }else{  
             i++;
         }} 
    int t=2;
    out.println(data2+"=");
      while(data2!=1){
         if(data2%t==0){           
          out.println(t+"*");
          data2/=t;
         }else{  
             t++;
         }}
    int r=2;
    out.println(data3+"=");
      while(data3!=1){
         if(data3%r==0){           
          out.println(r+"*");
          data3/=r;
         }else{  
             r++;
         }}                 
    %>         
    </body>
</html>
