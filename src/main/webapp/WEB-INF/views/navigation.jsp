<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/style.css" />" rel="stylesheet" type="text/css" />
<title>Navigation</title>
</head>

	<frameset cols="20%,*">
	   <frame src="GPOFunctions.jsp" target="login"/>
	   <frame src="createAssessment.jsp"  target="body"/>
    </frameset>

</html>