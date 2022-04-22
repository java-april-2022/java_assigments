<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple Receipt</title>
</head>
<body>
	<h2>Customer Name: <c:out value= "${name}"></c:out></h2>
	<p>Item Name: <c:out value= "${item}"></c:out></p>
	<p>Price: <c:out value= "${price}"></c:out></p> 
	<p>Description: <c:out value= "${description}"></c:out></p>
	<p>Vendor: <c:out value= "${vendor}"></c:out></p>
	
</body>
</html>