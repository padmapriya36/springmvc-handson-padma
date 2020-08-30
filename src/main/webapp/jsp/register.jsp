<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration</title>
</head>
<body>
<form:form id="regForm" modelAttribute="user" action="registerProcess" method="post">
    <table align="center">
        <tr>
            <td><form:label path="username">Please enter your username: </form:label></td>
            <td><form:input path="username" name="username" id="username"/></td>
            <td style="font-style: italic; color: red;"><form:errors path="username" cssClass="error" /></td>
        </tr>
        <tr>
            <td><form:label path="password">Please enter your password: </form:label></td>
            <td><form:input path="password" name="password" id="password"/></td>
            <td style="font-style: italic; color: red;"><form:errors path="password" cssClass="error" /></td>
        </tr>
        <tr>
            <td><form:label path="firstName">Please enter your first name: </form:label></td>
            <td><form:input path="firstName" name="firstName" id="firstName"/></td>
            <td style="font-style: italic; color: red;"><form:errors path="firstName" cssClass="error" /></td>
        </tr>
        <tr>
            <td><form:label path="lastName">Please enter your last name: </form:label></td>
            <td><form:input path="lastName" name="lastName" id="lastName"/></td>
            <td style="font-style: italic; color: red;"><form:errors path="lastName" cssClass="error" /></td>
        </tr>
        <tr>
            <td><form:label path="age">Please enter your age: </form:label></td>
            <td><form:input path="age" name="age" id="age"/></td>
            <td style="font-style: italic; color: red;"><form:errors path="age" cssClass="error" /></td>
        </tr>
        <tr>
        </tr>
        <tr>
        </tr>
        <tr>
            <td style="font-style: italic; color: red;">${message}</td>
        </tr>
        <tr>
            <td></td>
            <td><form:button id="register" name="register">Register</form:button></td>
        </tr>
        <tr></tr>
        <tr>
            <td></td>
            <td><a href="home.jsp">Home</a></td>
        </tr>
    </table>
</form:form>
</body>
</html>