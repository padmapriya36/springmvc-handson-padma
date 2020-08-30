<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My Book Details</title>
</head>
<body>
<table>
    <tr>
        <td>Hi ${firstName} ${lastName}!</td>
    </tr>
    <tr>
        <td>Your Book Details:</td>
    </tr>
    <tr>
        <td>Book Name: ${bookName}</td>
    </tr>
    <tr>
        <td>Book Description: ${bookDescription}</td>
    </tr>
    <tr>
        <td><a href="home.jsp">Home</a></td>
    </tr>
</table>
</body>
</html>
