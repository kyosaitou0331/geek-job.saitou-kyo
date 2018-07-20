<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>かごゆめトップ</title>
    <link rel="stylesheet" href="kagoyume.css">
</head>
<body>
    <h5><%@include file="header.jsp"%></h5>
    <h1>かごゆめショッピング</h1>
    <h3>この度はかごゆめショッピングにお越しいただきありがとうございます。</h3>
    <h3>どうぞお楽しみください。
    </h3><br>
キーワードを入れてみよう        
<form action="Search" method="GET">
      <input type="text" name="searchword">
      <br>
      <input type="submit" name="btnSubmit" value="検索">
</form>
<br>
コードを入れてみよう
<form action="Item" method="GET">
      <input type="text" name="code">
      <br>
      <input type="submit" name="btnSubmit" value="検索">
</form>

</body>   
</html>
