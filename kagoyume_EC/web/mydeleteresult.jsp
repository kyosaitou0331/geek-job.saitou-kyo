<%@page import="jums.JumsHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
     JumsHelper jh = JumsHelper.getInstance();
 %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>削除結果画面</title>
        <link rel="stylesheet" href="kagoyume.css">
    </head>
    <body>
    <h4>削除確認</h4>
    削除しました。<br>
     <br>
     <%=jh.home()%>
    </body>
</html>