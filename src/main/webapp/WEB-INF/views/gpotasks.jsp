<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/style.css" />" rel="stylesheet" type="text/css" />
<title>GPO Functions</title>
</head>
<body>
			
			<a href="createassessment.html" target="body">Create Assessment</a>
		
			<br><br><br>
			
			<a href="viewassessment.html" target="body">View Assessment</a>
			
			<br><br><br>
			
			<a href="searchassessment.html" target="body">Search Assessment</a>
			
			<br><br><br>
		
			<a href="generatereport.html" target="body">Generate Report</a>
		
			<br><br><br>
			
			<a href="login.jsp" onclick="jumpto(this.href,'body.jsp'); return false;">Logout</a>

</body>
</html>