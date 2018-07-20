<%@page import="java.util.ArrayList"%>
<%@page import="jums.JumsHelper"
        import="jums.UserDataDTO" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    JumsHelper jh = JumsHelper.getInstance();
    UserDataDTO udd = (UserDataDTO)session.getAttribute("userdate");
    if (udd==null){
           response.sendRedirect(request.getContextPath());
    }else{ 
    HttpSession hs = request.getSession();
   
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>かごゆめ会員画面</title>
        <link rel="stylesheet" href="kagoyume.css">
    </head>
    <body>
        <h1><%=udd.getName()%>さんの情報画面</h1>
        <p class="txt2">
        名前:<%= udd.getName()%><br>
        パスワード:<%= udd.getPassword()%><br>
        メールアドレス:<%= udd.getMail()%><br>
        住所:<%= udd.getAddress()%><br>
        総購入金額:<%= udd.getTotal()%><br>
        登録日時:<%= udd.getNewDate()%><br></p>
        <form action="Myupdate" method="POST">
        <input type="submit" name="myupdate" value="変更"style="width:100px">
        </form>
        <br>
        <form action="Mydelete" method="POST">
        <input type="submit" name="mydelete" value="削除"style="width:100px">
        </form>
        <br>
        <form action="Myhistory" method="POST">
        <input type="submit" name="history" value="購入履歴"style="width:100px">
        </form>
        <br>
        <a><%=jh.home()%></a>
        <br>
    <%}%>
    </body>
</html>
