<%@page import="java.util.ArrayList"%>
<%@page import="jums.JumsHelper"
        import="jums.HistoryDTO" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    JumsHelper jh = JumsHelper.getInstance();
    ArrayList<HistoryDTO> hdd = (ArrayList<HistoryDTO>)request.getAttribute("history");
%>

<!DOCTYPE html>
<html>
    <head>
         <title>購入履歴画面</title>
         <link rel="stylesheet" href="kagoyume.css">
    </head>
    <body>
        <h1>購入履歴</h1><br>
        <%for(HistoryDTO hd:hdd){%>
        <p class="txt">
        商品：<%= hd.getName()%><br>
        コード:<%= hd.getItemcode()%><br>
        配送方法:<%= jh.exTypenum(hd.getType())%><br>
        購入日時:<%= hd.getBuyDate()%><br>
        <img src="<%= hd.getImage()%>" alt="写真イラスト1"><br></p>
        <%}%>
       <br>
        <form action="mydate.jsp" method="POST">
        <input type="submit" name="NO" value="会員情報へ"style="width:100px">
        </form>
       <br><br>
    </body>
    <%=jh.home()%>
</html>
