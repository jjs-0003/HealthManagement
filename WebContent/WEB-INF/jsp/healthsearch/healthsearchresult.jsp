<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>検索結果</title>
    </head>
    <body>

    <table  name="health" border="3">
        <table class="table">
        <c:forEach var="health" items="${healthlist}">
        <option value="${health.id}">

        <tr>
        <th>ID</th>
        <th>身長</th>
        <th>体重</th>
        <th>BMI</th>
        <th>睡眠時間</th>
        </tr>
        <tr>
        <td>${health.date}</td>
        <td>${health.height}</td>
        <td>${health.weight}</td>
        <td>${health.bmi}</td>
        <td>${health.sleepTime}</td>
        </tr>
        </option>
    </table>
       </c:forEach>
                    </table>
    </body>
</html>