<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>削除完了</title>
</head>
<body>
    <center>
        <h1>削除完了</h1>
        以下の情報を削除しました。<br><br>
        <form action="HealthListServlet" method="post">
            管理ID ${healthUp.id}<br>
            <br> 身長 ${healthUp.height}<br>
            <br> 体重 ${healthUp.weight}<br>
            <br> 睡眠時間 ${healthUp.sleepTime}<br>
            <input name="updatejump" type="submit" value="一覧へ戻る">
        </form>
    </center>
</body>
</html>