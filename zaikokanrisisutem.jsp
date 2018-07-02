<%-- 
    Document   : test
    Created on : 2018/07/02, 20:35:06
    Author     : owner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="./zaikokanrisisutem2" method="get">
        ログインしました！<br>
        商品登録<br>
        ID<input type="text" name="ID"><br>
        商品名<input type="text" name="name"><br>
        個数<input type="text" name="amo"><br>
        種類<input type="text" name="type"><br>
        <input type="submit" value="登録"><br>
        </form>
        <form action="./zaikokanrisisutem3" method="get">
            <input type="submit" value="在庫一覧">
        </form>
        <form action="./zaikokanrisisutem.html" method="get">
            <input type="submit" value="ログアウト">
        </form>
    </body>
</html>
