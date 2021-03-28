<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Hello - Main</title>
</head>
<body>
<h2>Hello World!</h2>
<form action="${pageContext.request.contextPath}/hello">
    <label>
        I am:
        <input type="text" name="user">
    </label>
    <input type="submit" value="Say Hi to me">
</form>
<form action="${pageContext.request.contextPath}/employee">
    <input type="submit" value="View All Employees">
</form>
</body>
</html>
