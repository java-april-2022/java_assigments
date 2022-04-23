<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Here is Your Omikuji!!</h1>
	<h2>
		<<c:out value="${result}"/>
	</h2>
	
	<a href="/omikuji">Go Back</a>
</body>
</html>