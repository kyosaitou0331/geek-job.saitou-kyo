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
        <title>購入確認画面</title>
        <link rel="stylesheet" href="kagoyume.css">
    </head>
    <body>
         <h1>商品情報</h1>
         <hr>
        <%for (SearchAPI sea:seas){%>
        <p class="txt">
        商品:<%= sea.getName()%><br>
        値段:<%= sea.getPrice()%><br>
        コード:<%= sea.getCode()%><br>
        <%}%>
        <hr>
        <form action="Buycomplete" method="POST">
        合計金額：<%= session.getAttribute("total")%>
        <br><br>
        発送方法：
        <br>
        <% for(int i = 1; i<=2; i++){ %>
        <input type="radio" name="radio" value="<%=i%>" checked><%=jh.exTypenum(i)%>
        <% } %>
        <br><br>
      　<input type="submit" name="buycomplete" value="上記の内容で購入する！">
       </form>
        <br><br>
         <form action="Cart" method="POST">
      <input type="submit" name="cart" value="カートに戻る">
       </form>
    </body>
    <%=jh.home()%>
</html>
