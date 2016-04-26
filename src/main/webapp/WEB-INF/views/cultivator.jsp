<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/style.css" />" rel="stylesheet" type="text/css" />
<title>Cultivator</title>
</head>
<body>
<div align="center">
<form:form action="cultivator.html" method="post">
<form:label path="fname">Fname</form:label><form:input path="fname"/><br><br>
<form:label path="lname">Lname</form:label><form:input path="lname"/><br><br>
<form:label path="adhar_no">Adhar_no</form:label><form:input path="adhar_no"/><br><br>
<form:label path="phone_no">Phone_no</form:label><form:input path="phone_no"/><br><br>
<input type="submit" value="create"/>
</form:form>
</div>
</body>
</html>