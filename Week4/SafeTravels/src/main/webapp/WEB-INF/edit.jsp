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
    <title>Edit New Expense</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Edit Expense</h1><a href="/">Go Back</a>
	<form:form action="/update/${editExpense.id}" method="put" modelAttribute="editExpense" class="form-group">
	<form:label path="expense">Expense Name:</form:label>
	    <form:input path="expense" class="form-control" />
	    <form:errors class ="text-danger" path="expense"/>
	    
	    <form:label path="vendor">Vendor:</form:label>
	    <form:input path="vendor" class="form-control"/>
	    <form:errors class ="text-danger" path="vendor"/>
	    
	    <form:label path="amount">Amount:</form:label>
	    <form:input path="amount" class="form-control"/>
	    <form:errors class ="text-danger" path="amount"/>
	    
	    <form:label	path="description">Description:</form:label>
	    <form:input path="description" class="form-control"/>
	    <form:errors class ="text-danger" path="description"/>
		
		<button>Update Expense</button>
	</form:form>
</body>
</html>