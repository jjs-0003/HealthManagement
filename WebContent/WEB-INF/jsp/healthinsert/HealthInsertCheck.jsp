<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>記録確認</title>
</head>
<body>

    <center>
        <h1>記録確認</h1>
        <h2>以下の情報で登録します。</h2>

        <h4>身長</h4>
        <%
            String height = (String) session.getAttribute("height");
        %>
        <%=height%>

        <h4>体重</h4>
        <%
            String weight = (String) session.getAttribute("weight");
        %>
        <%=weight%>

        <h4>睡眠時間</h4>
        <%
            String sleeptime = (String) session.getAttribute("sleeptime");
        %>
        <%=sleeptime%>

        <br>
        <br> <a href="HealthInsertServlet3"><input type="submit" value="　　記録　　"></a>
             <a href="HealthInsertServlet"><input type="submit"value="キャンセル"></a>
    </center>

</body>
</html>