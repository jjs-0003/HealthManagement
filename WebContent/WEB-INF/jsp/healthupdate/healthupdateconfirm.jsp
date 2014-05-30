<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>変更確認</title>
</head>
<body>
    <center>
        <h1>変更確認</h1>
        <br>
        以下の情報で変更します。<br><br>
        <form action="HealthUpdateCompleteServlet" method="post">
            管理ID ${healthUp.id}<br>
            <br> 身長 ${healthUp.height}<br>
            <br> 体重 ${healthUp.weight}<br>
            <br> 睡眠時間 ${healthUp.sleepTime}<br>
            <br> <input name="updateJump" type="submit" value="変更">
            <input name="updateJump" type="submit" value="キャンセル">
        </form>
        <br>
    <br>
    <a href="HealthServlet">メニューに戻る</a>;
    </center>
</body>
</html>