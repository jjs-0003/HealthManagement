<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BMI計算結果</title>
</head>
<body>
    <center>
        <h1>BMI計算結果</h1>

        <h2><%=request.getAttribute("bmi")%></h2>

        <br>

        <h3><%=request.getAttribute("message")%></h3>

        <br> <br> <a href="HealthServlet">メニューに戻る</a>;
    </center>
</body>
</html>