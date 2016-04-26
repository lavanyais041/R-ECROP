<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/style.css" />" rel="stylesheet" type="text/css" />
<title>Login Page</title>
</head>
<body>
<div id="error"></div>
<form name="login" action="login.html" method="post" onsubmit="validate()">
	
		<h2>login</h2>
	
		<input type="text" name="userName" placeholder="USERNAME" required="required"/>
		<br/><br>
		
		<input type="password" name="password" placeholder="PASSWORD" required="required"/>
		<br/>
	<input type="submit" value="submit"  />		
</form>

</body>
</html>