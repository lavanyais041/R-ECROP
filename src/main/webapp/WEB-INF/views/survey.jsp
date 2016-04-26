<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/style.css" />" rel="stylesheet" type="text/css" />
<title>Survey Page</title>
</head>
<body>
   <div align="center">
	<form:form action="survey.html" method="post">
		<form:label path="survey_no">Survey_no</form:label><form:input path="survey_no"/><br><br>
		<form:label path="owner_name">Owner_name</form:label><form:input path="owner_name"/><br><br>
		<form:label path="soil_color">soil_color</form:label><form:input path="soil_color"/><br><br>
		<form:label path="area">area</form:label><form:input path="area"/><br><br>
		<input type="submit" value="create"/>
	</form:form>
	</div>
</body>
</html>