<%-- <%@page import="sit.mp.ecrop.entity.Assessment"%>
<%@page import="java.util.List"%> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/style.css" />" rel="stylesheet" type="text/css" />
<title>View page</title>
</head>
<body>
	
	<table border="5" align="center">

 <tr>
 			<td>AssmtID</td>
			<td>SurveyNumber</td>
			<td>Area</td>
			<td>Crop</td>
			<td>Start Date</td>
			<td>End Date</td>
			<td>Predicted Yield</td>
			<td>Image</td>
			
 </tr>
 
 <c:forEach items="${assmtList}" var="assmt">
			<tr>
				<td><c:out value="${assmt.assess_id}"></c:out></td>
				<td><c:out value="${assmt.survey_number}"></c:out></td>
				<td><c:out value="${assmt.area}"></c:out></td>
				<td><c:out value="${assmt.crop}"></c:out></td>
				<td><c:out value="${assmt.start_date}"></c:out></td>
				<td><c:out value="${assmt.end_date}"></c:out></td>
				<td><c:out value="${assmt.predicted_yield}"></c:out></td>
				<td><img width="100" height="100" src="/ecrop/imagedisplay?assess_id=${assmt.assess_id}"/></td>
			</tr>
 </c:forEach>

</table>
</body>
</html>