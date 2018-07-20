<%@page import="jums.JumsHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
   JumsHelper jh = JumsHelper.getInstance();
%>
        
<!DOCTYPE html>
<html lang="ja">
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>商品追加完了画面</title>
        <link rel="stylesheet" href="kagoyume.css">
    </head>
    <body>
        <h5><%@include file="header.jsp"%></h5>
        <h1>商品追加完了画面</h1><br>
        <h3>カートに追加しました！
            </h3><br>
          <form action="Cart" method="POST">
          <input type="submit" name="cart" value="カート閲覧">
          </form>
          <br>
          <%=jh.home()%>
    </body>
</html>