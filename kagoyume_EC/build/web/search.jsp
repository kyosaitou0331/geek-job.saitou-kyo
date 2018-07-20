<%@page import="java.util.ArrayList"
        import="javax.servlet.http.HttpSession"
        import="jums.JumsHelper"
        import="jums.SearchAPI" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    JumsHelper jh = JumsHelper.getInstance();
    HttpSession hs = request.getSession();
    ArrayList<SearchAPI> saa=(ArrayList<SearchAPI>)hs.getAttribute("sa");
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
        <%= hs.getAttribute("s.word")%>の検索結果
        <%= hs.getAttribute("app")%>件ヒットしました！
        <br><br>
        <% for(SearchAPI sa :saa){%>
        <table border="1" ><tr><th>
        <img src="<%= sa.getImage()%>"  alt="写真イラスト1" class="icon"></th>
        <th>
        商品:<a href="Item?code=<%= sa.getCode()%>"><%= sa.getName()%></a><br>
        値段:<%= sa.getPrice()%><br>
        コード:<%= sa.getCode()%><br>
        情報:<%= sa.getDescription()%><br>
        <br><br><th></tr></table>
        <%}%>
        <br><br>
        <%=jh.home()%>
    </body>
</html>