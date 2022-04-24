<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current Visit Count</title>
</head>
<body>
	<p style= "text-align:center">
		You have visited <a href="/"> 
		<c:out value= "${page}"/> 
		<c:out value= "${count}"/></a>
	</p>
	<p style= "text-align:center">
		<a href="/">Test another visit</a>	
	</p>
</body>
</html>