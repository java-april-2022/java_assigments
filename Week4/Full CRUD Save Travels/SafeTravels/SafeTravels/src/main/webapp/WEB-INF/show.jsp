<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Expense</title>
</head>
<body>
	<div>
		<h1>Expense Details</h1><a href="/">Go back</a>
		<table class="table">
			<tr>
				<th>Expense Name:</th>
				<td>
				<c:out value="${expense.name}"/>
				</td>
			</tr>
			<tr>
				<th>Expense Description:</th>
				<td>
				<c:out value="${expense.description}"/>
				</td>
			</tr>
			<tr>
				<th>Vendor:</th>
				<td>
				<c:out value="${expense.vendor}"/>
				</td>
			</tr>
			<tr>
				<th>Amount Spent:</th>
				<td>
				<c:out value="${expense.price}"/>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>