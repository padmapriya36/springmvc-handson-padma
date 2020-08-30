<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Welcome</title>
</head>
<body>
<table align="center">
    <form:form id="loginSuccessful" modelAttribute="username" action="getProfile" method="get">
        <table align="center">
            <tr>
                <td>Welcome ${username}</td>
                <td></td>
                <td><form:button id="username" name="username" value="${username}">My Profile</form:button></td>
            </tr>
        </table>
    </form:form>
    <form:form id="loginSuccessful" modelAttribute="username" action="bookInfo" method="Post">
        <table align="center">
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td><form:button id="username" name="username" value="${username}">My Books</form:button></td>
            </tr>
        </table>
    </form:form>
</table>
</body>
</html>
