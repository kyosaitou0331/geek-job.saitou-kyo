<%@page import="jums.SearchAPI"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jums.JumsHelper" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    JumsHelper jh = JumsHelper.getInstance();
    ArrayList<SearchAPI> seas = (ArrayList<SearchAPI>)session.getAttribute("itemcode");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>カート画面</title>
        <link rel="stylesheet" href="kagoyume.css">
    </head>
    <body>
        <h5><%@include file="header.jsp"%></h5>
         <h1>商品情報</h1>
        <%for (SearchAPI sea:seas){%>
        <table border="1" ><tr><th>
        <img src="<%= sea.getImage()%>" alt="写真イラスト1"class="icon"><br></th>
        <br><th>
        商品:<%= sea.getName()%><br>
        値段:<%= sea.getPrice()%><br>
        コード:<%= sea.getCode()%><br>
        情報:<%= sea.getDescription()%><br>
        <br></p></th></tr></table>
        <form action="Cartdelete" method="POST">
            <input type="hidden" name="itemcode" value="<%= sea.getCode()%>" >
            <input type="submit" name="cartdelete" value="削除"style="width:100px">
        </form>
        <br><br>
        <%}%>
        <br><br>
         合計金額：<%= session.getAttribute("total")%>
        <br><br>
        <form action="Buyconfirm" method="POST">
      <input type="submit" name="buyconfirm" value="購入する！">
       </form>
        <br><br>
    </body>
    <%=jh.home()%>
</html>
