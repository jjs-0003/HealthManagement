<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <center>
    <form action="HealthListJumpServlet" method="POST">
        <c:out value="${message}"></c:out>
        <table class="table">
            <select name="example5" size="5" >
                <c:forEach var="health" items="${healthlist}">
                    <tr>
                       <option value="サンプル1"> <td>${health.id}</td>
                        <td>${health.date}</td>
                        <td>${health.height}</td>
                        <td>${health.weight}</td>
                        <td>${health.bmi}</td>
                        <td>${health.sleepTime}</td>
                        </option>
                    </tr>
                </c:forEach>
            </select>
        </table>
        <input type="submit" value="変更"> <input type="submit"
            value="削除">
    </form>
    </center>
</body>
</html>