<%@page import="jums.JumsHelper"%>
<%@page import="javax.servlet.http.HttpSession" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    JumsHelper jh = JumsHelper.getInstance();
    HttpSession hs = request.getSession();
    boolean reinput = false;
    if(request.getAttribute("mo") != null){
        reinput = true;
    }
    String url=request.getHeader("Referer");
    session.setAttribute("url",url);
%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>かごゆめログイン</title>
    <link rel="stylesheet" href="kagoyume.css">
</head>
<body>
    <h1>かごゆめログイン画面</h1><br>
    <%if(reinput==true){%>
      <h4>ログインできませんでした。
          名前やパスワードをお確かめください。</h4>
    <%}%>
      <form action="Login" method="POST">
        名前
        <br>
        <input type="text" name="name">
        <br><br>  
        パスワード
        <br>
        <input type="password" name="password">
        <br><br>
      <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
      <input type="submit" name="btnSubmit" value="ログイン">
     </form>
      <br><br>
      <a href="Registration">新規会員登録</a><br><br>
  
      <a><%=jh.home()%></a>
</body>
  
</html>