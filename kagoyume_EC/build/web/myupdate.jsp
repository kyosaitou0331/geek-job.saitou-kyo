<%@page import="jums.UserData"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jums.JumsHelper" 
        import="jums.UserDataDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    JumsHelper jh = JumsHelper.getInstance();
     HttpSession hs = request.getSession();
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>会員情報更新画面</title>
        <link rel="stylesheet" href="kagoyume.css">
    </head>
    <body>
         <h1>会員情報変更画面</h1><br>
    <form action="Myupdateresult" method="POST"class="key">
        名前:
        <br>
        <input type="text" name="name" placeholder='名前を入力してください' required>
        <br><br>
          
        パスワード：
        <br>
        <input type="password" name="password" placeholder='パスワードを入力してください' required>
        <br><br>
        
        メールアドレス：
        <br>
        <input type="text" name="mail" size="50" placeholder='メールアドレスを入力してください' required>
        <br><br>
        
        住所：
        <br>
        <textarea name="address" rows=3 cols=30 placeholder='住所を入力してください' required></textarea>
        <br><br>
        
        <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
        <input type="submit" name="btnSubmit" value="確認画面へ">
    　　</form>
        <br>
        <%=jh.home()%>
    </body>
</html>
