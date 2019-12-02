<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student registration form</title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">

First Name: <form:input path="firstName"/>
<br><br>
Last Name: <form:input path="lastName"/>
<br><br>
<input type="submit" value="Submit">

</form:form>

</body>
</html>