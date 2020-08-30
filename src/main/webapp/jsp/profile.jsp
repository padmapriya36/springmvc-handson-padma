<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Padma Priya
  Date: 8/18/2020
  Time: 5:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My Profile</title>
</head>
<body>
<table>
    <tr>
        <td>Hi ${firstName} ${lastName}!</td>
    </tr>
    <tr>
        <td>Your Profile Details:</td>
    </tr>
    <tr>
        <td>User Name: ${username}</td>
    </tr>
    <tr>
        <td>First Name: ${firstName}</td>
    </tr>
    <tr>
        <td>Last Name: ${lastName}</td>
    </tr>
    <tr>
        <td>Age: ${age}</td>
    </tr>
    <tr>
        <td><a href="home.jsp">Home</a></td>
    </tr>
</table>
</body>
</html>
