<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/style.css" />" rel="stylesheet" type="text/css" />
<title>Import</title>
</head>
<body>

<p>select the file to upload</p>
<form action='' method='POST' enctype='multipart/form-data'>
    <input type='file' name='userFile'><br>
    <input type='submit' name='upload_btn1' value='upload file'>
</form>
<br>
<p>select the respective image for the file</p>
<form action='' method='POST' enctype='multipart/form-data'>
    <input type='file' name='userFile'><br>
    <input type='submit' name='upload_btn2' value='upload image'>
</form>

</body>
</html>