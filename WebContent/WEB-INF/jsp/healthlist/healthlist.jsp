<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>一覧</title>
</head>
<body>
    <center>
        <h1>一覧</h1>

        <form action="HealthListJumpServlet" method="POST">

                <table class="table">

                    <c:forEach var="healthh" items="${healthlist}">
                        <tr>
                            <c:set value="${healthh.id}" />
                            <c:if test="${value == 1}">
                            <input type="radio" name="health" value="${health.id}" checked="checked">
                            </c:if>
                            <c:if test="${value > 1}">
                            <input type"=radio" name="health" value="${health.id}">
                            </c:if>
                            <td>${health.id}</td>
                            <td>${health.date}</td>
                            <td>${health.height}</td>
                            <td>${health.weight}</td>
                            <td>${health.bmi}</td>
                            <td>${health.sleepTime}</td>
                            </option>

                        </tr>
                    </c:forEach>

                </table>
             <br>
            <input name="listjump" type="submit" value="変更">
            <input name="listjump" type="submit" value="削除">
        </form>
    </center>
</body>
</html>