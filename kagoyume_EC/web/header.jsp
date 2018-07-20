
<%@page import="jums.UserDataDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
  UserDataDTO userdate=(UserDataDTO)session.getAttribute("userdate");
%>


<header>
    <% if(userdate==null){%>
    <h10>ようこそ！ゲストさん！</h10>
        <a href="login.jsp">ログイン</a>
        <a href="Cart">カートへ</a>
    <%}else{%>
     <h10>ようこそ！<%=userdate.getName()%>さん！</h10>
        <a href="Logout">ログアウト</a>
        <a href="Cart">カートへ</a>
        <a href="mydate.jsp">会員情報</a>
    <%}%>
</header>