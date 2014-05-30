<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>記録</title>
</head>
<body>

    <form method="get" action="HealthInsertServlet2">

        <center>
            <h1>記録情報</h1>
            <h3>各項目を入力してください。</h3>
            <br>

            <h4>身長</h4>
            <textarea name="height" rows="1" cols="10"></textarea>
            <h4>体重</h4>
            <textarea name="weight" rows="1" cols="10"></textarea>
            <h4>睡眠時間</h4>
            <textarea name="sleeptime" rows="1" cols="10"></textarea>
            <br> <br>
             <input type="submit" name=c value="確認" />

        </center>
    </form>
    <center>
    <br>

    <a href="HealthServlet"><input type="submit"value="メニューへ"></a>

    </center>

</body>
</html>