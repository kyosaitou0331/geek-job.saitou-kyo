<%@page import="jums.JumsHelper"
        import="jums.UserDataDTO" %>
<%
    JumsHelper jh = JumsHelper.getInstance();
     HttpSession hs = request.getSession();
    UserDataDTO udd= (UserDataDTO)session.getAttribute("userdate");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>削除確認画面</title>
        <link rel="stylesheet" href="kagoyume.css">
    </head>
    <body>
    <h4>削除確認</h4>
    このユーザーをマジで削除しますか？<br>
    <p class="txt2">
    名前:<%= udd.getName()%><br>
    パスワード:<%= udd.getPassword()%><br>
    メールアドレス:<%= udd.getMail()%><br>
    住所:<%= udd.getAddress()%><br>
    登録日時:<%= udd.getNewDate()%><br></p>
     
    <form action="Mydeleteresult" method="POST">
      <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
      <input type="submit" name="YES" value="はい"style="width:100px">
    </form><br>
    <form action="index.jsp" method="POST">
      <input type="submit" name="NO" value="いいえ"style="width:100px">
    </form>
    </body>
</html>
