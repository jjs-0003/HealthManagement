<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>検索画面</title>
    </head>
    <body>

    <form action="HealthSerchServlet" method="post">
    <input type="radio" checked="checked"/>日付
    <select name="month" size="1">
    <option value="1月">1月</option>
    <option value="2月">2月</option>
    <option value="3月">3月</option>
    <option value="4月">4月</option>
    <option value="5月">5月</option>
    <option value="6月">6月</option>
    <option value="7月">7月</option>
    <option value="8月">8月</option>
    <option value="9月">9月</option>
    <option value="10月">10月</option>
    <option value="11月">11月</option>
    <option value="12月">12月</option>
    </select>～

    <select name="day" size="1">
    <option value="1月">1月</option>
    <option value="2月">2月</option>
    <option value="3月">3月</option>
    <option value="4月">4月</option>
    <option value="5月">5月</option>
    <option value="6月">6月</option>
    <option value="7月">7月</option>
    <option value="8月">8月</option>
    <option value="9月">9月</option>
    <option value="10月">10月</option>
    <option value="11月">11月</option>
    <option value="12月">12月</option>
    </select>

    <br>
    <br>

	<input type="radio"/>体重

    <br>
    <br>

    <input type="radio"/>睡眠時間

    <br>
    <br>

    <input type="radio"/>BMI

    <br>
    <br>

    <input type="submit" value="検索">

    </form>
    </body>
</html>