<%@page import="java.util.ArrayList"%>
<%@page import="jums.JumsHelper" 
        import="jums.UserDataDTO"%>

<%
    JumsHelper jh = JumsHelper.getInstance();
     HttpSession hs = request.getSession();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS変更画面</title>
    </head>
    <body>
    <form action="UpdateResult" method="POST">
        名前:
        <input type="text" name="name" value="">
        <br><br>

        生年月日:　
        <select name="year">
            <option value="">----</option>
            <% for(int i=1950; i<=2010; i++){ %>
            <option value="<%=i%>" ><%=i%></option>
            <% } %>
        </select>年
        <select name="month">
            <option value="">--</option>
            <% for(int i = 1; i<=12; i++){ %>
            <option value="<%=i%>" ><%=i%></option>
            <% } %>
        </select>月
        <select name="day">
            <option value="">--</option>
            <% for(int i = 1; i<=31; i++){ %>
            <option value="<%=i%>"><%=i%></option>
            <% } %>
        </select>日
        <br><br>

        種別:
        <br>
            <% for(int i = 1; i<=3; i++){ %>
            <input type="radio" name="type" value="<%=i%>"><%=jh.exTypenum(i)%><br>
            <% } %>
        <br>

        電話番号:
        <input type="text" name="tell" value="">
        <a href="searchresult.jsp"></a>
        <br><br>

        自己紹介文
        <br>
        <textarea name="comment" rows=10 cols=50 style="resize:none" wrap="hard"></textarea><br><br>
        
        <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
        <input type="submit" name="btnSubmit" value="確認画面へ">
    </form>
         <form action="resultdetail.jsp" method="POST">
            <input type="submit" name="resultdetail" value="詳細画面に戻る">
<!--            <input type="hidden" name="mode" value="REINPUT">-->
        </form>
        <br>
        <%=jh.home()%>
    </body>
</html>