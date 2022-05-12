<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>Safe Travles</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
	<body>
		<h1>Save Travels</h1>
		<table>
		<thead>
			<tr>
			  <th>Expense</th>
		      <th>Vendor</th>
		      <th>Amount</th>
		      <th>Action</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach items = "${allTravels}" var = "travels">
		    <tr>
		      <td><a href="/view/${travels.id}"><c:out value="${travels.expense}"></c:out></a></td>
		      <td><c:out value="${travels.vendor}"></c:out></td>
		      <td><c:out value="${travels.amount}"></c:out></td>
		      <td><a href="/edit/${travels.id}">Edit</a></td>
		      <td>
		      	<form action="/expenses/delete/${expense.id}" method="post">
    					<input type="hidden" name="_method" value="delete">
    					<input type="submit" value="Delete" class="btn-danger">
			  	</form>
		      </td>
		    </tr>
		    </c:forEach>
		    
		    </tbody>
		</table>
		<h2>Add an Expense</h2>
		<form:form action="/create" method="post" modelAttribute="newPrice" class="form-group">
		<form:label path="expense">Expense Name:</form:label>
		    <form:input path="expense" class="form-control"/>
		    <form:errors class ="text-danger" path="expense" style="width:250px;"/>
		    
		    <form:label path="vendor">Vendor:</form:label>
		    <form:input path="vendor" class="form-control"/>
		    <form:errors class ="text-danger" path="vendor" style="width:250px;"/>
		    
		    <form:label path="amount">Amount:</form:label>
		    <form:input path="amount" class="form-control"/>
		    <form:errors class ="text-danger" path="amount" style="width:250px;"/>
		    
		    <form:label	path="description">Description:</form:label>
		    <form:input path="description" class="form-control"/>
		    <form:errors class ="text-danger" path="description" style="width:250px;" rows="3"/>
		
			<button>Create Expense</button>
		</form:form>
	</body>
</html>