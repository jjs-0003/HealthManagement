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

    ID
    身長


    <select name="health" size="5">


                <table class="table">





                    <c:forEach var="health" items="${healthlist}">
                        <tr>

                            <option value="${health.id}">
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
                    </select>



    </body>
</html>