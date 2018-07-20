<%@page import="java.util.ArrayList"
        import="javax.servlet.http.HttpSession"
        import="jums.JumsHelper"
        import="jums.SearchAPI" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    JumsHelper jh = JumsHelper.getInstance();
    HttpSession hs = request.getSession();
    SearchAPI saa=(SearchAPI)hs.getAttribute("saa");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>かごゆめショッピング</title>
        <link rel="stylesheet" href="kagoyume.css">
    </head>
    <body>
        <h5><%@include file="header.jsp"%></h5>
        <h1>商品情報</h1>
        <img src="<%= saa.getImage()%>" alt="写真イラスト1" class="icon"><br>
        <br>
        <p class="txt">
        商品:<%= saa.getName()%><br>
        値段:<%= saa.getPrice()%><br>
        コード:<%= saa.getCode()%><br>
        情報:<%= saa.getDescription()%><br></p>
        <br><br>
        <form action="Add" method="GET">
            <input type="hidden" name="itemcode" value="<%= saa.getCode()%>" >
            <input type="submit" name="cart" value="カートに追加する！">
       </form>
        <br><br>
        <%=jh.home()%>
    </body>
</html>