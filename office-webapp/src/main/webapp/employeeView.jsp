<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employees</title>
</head>
<body>
    <table border="solid">
        <tr><th>Id</th><th>First Name</th><th>Last Name</th><th>Email</th></tr>
        <c:forEach var="employee" items="${requestScope.employees}">
            <tr>
                <td>${employee.id}</td><td>${employee.firstName}</td><td>${employee.lastName}</td><td>${employee.email}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
