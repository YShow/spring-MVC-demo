<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
First Name: <form:input path="firstName" />
<br><br>
Last Name: <form:input path="lastName" />
<br><br>
Country:
<form:select path="country">
<form:options items="${student.countryOptions}" />
</form:select>
<br><br>
Favorite Language: 
Java <form:radiobutton path="favoriteLanguage" value="Java" />
C# <form:radiobutton path="favoriteLanguage" value="C#" />
PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
<br><br>
Operating Systems:
Linux<form:checkbox path="operatingSystem" value="Linux" />
Mac Os<form:checkbox path="operatingSystem" value="Mac OS" />
MS Windows<form:checkbox path="operatingSystem" value="MS Windows" />
BSD<form:checkbox path="operatingSystem" value="BSD" />
<br><br>
<input type="submit" value="Submit">
</form:form>
</body>
</html>