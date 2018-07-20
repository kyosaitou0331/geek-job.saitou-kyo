<%@page import="javax.servlet.http.HttpSession"
        import="jums.JumsHelper"
        import="jums.UserData" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    JumsHelper jh = JumsHelper.getInstance();
    HttpSession hs = request.getSession();
    UserData ud = null;
    boolean reinput = false;
    if(request.getParameter("mode") != null && request.getParameter("mode").equals("REINPUT")){
        reinput = true;
        ud = (UserData)hs.getAttribute("ud");
    }

%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>会員登録画面</title>
        <link rel="stylesheet" href="kagoyume.css">
    </head>
    <body>
         <h1>新規会員登録画面</h1><br>
    <form action="Registrationconfirm" method="GET"class="key">
        名前:
        <br>
        <input type="text" name="name" value="<% if(reinput){out.print(ud.getName());}%>">
        <br><br>
        
        パスワード：
        <br>
        <input type="password" name="password" value="<% if(reinput){out.print(ud.getPassword());}%>">
        <br><br>
        
        メールアドレス：
        <br>
        <input type="text" name="mail" size="50" value="<% if(reinput){out.print(ud.getMail());}%>">
        <br><br>
        
        住所：
        <br>
        <textarea name="address" rows=3 cols=30 ><% if(reinput){out.print(ud.getAddress());}%></textarea>
        <br><br>
        
        <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
        <input type="submit" name="btnSubmit" value="確認画面へ">
     </form>
        <br><br>
        <a><%=jh.home()%></a>
    </body>
</html>
