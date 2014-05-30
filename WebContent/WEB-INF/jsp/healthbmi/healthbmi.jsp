<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BMI計算ページ</title>
    </head>
    <body>
    <center>

    <h1>BMI計算ページ</h1>

    <h3>身長はメートルで入力してください</h3>

    <br>



    <form method="post" action="HealthBMIServlet">


            身長
            <input type="text" name="height">
            m

            <br>

            体重
            <input type="text" name="weight">
            kg

            <br>

            <input type="submit" value="計算" />

    </form>
    <br>
    <br>
    <a href="HealthServlet">メニューに戻る</a>;
    </center>
    </body>
</html>