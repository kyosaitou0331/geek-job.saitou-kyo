<%@page import="jums.UserData"%>
<%@page import="jums.JumsHelper" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    JumsHelper jh = JumsHelper.getInstance();
    UserData ud = (UserData)request.getAttribute("ud");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>更新結果画面</title>
        <link rel="stylesheet" href="kagoyume.css">
    </head>
    <body>
        <h1>変更結果</h1><br>
        <p class="txt2">
        名前:<%= ud.getName()%><br>
        パスワード:<%= ud.getPassword()%><br>
        メールアドレス:<%= ud.getMail()%><br>
        住所:<%= ud.getAddress()%><br>
        以上の内容で更新しました。<br></p>
    </body>
    <br><br>
    <%=jh.home()%>
    </body>
</html>
