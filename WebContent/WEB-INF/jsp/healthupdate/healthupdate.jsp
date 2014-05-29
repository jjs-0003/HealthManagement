<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>変更</title>
</head>
<body>
    <center>
        <h1>変更</h1><br>
        <form action="HealthUpdateConfirmServlet" method="post">
            管理ID        <input name="healthRecodeUpdateId" type="text" value="${healthRecord.id}"><br><br>
            身長          <input name="healthRecodeUpdateHeight" type="text" value="${healthRecord.height}"><br><br>
            体重          <input name="healthRecodeUpdateWeight" type="text" value="${healthRecord.weight}"><br><br>
            睡眠時間      <input name="healthRecodeUpdateSleepTime" type="text" value="${healthRecord.sleepTime}"><br><br>
            <input name="updatejump" type="submit" value="変更確認">
            <input name="updatejump" type="submit" value="一覧へ戻る">
        </form>
    </center>
</body>
</html>