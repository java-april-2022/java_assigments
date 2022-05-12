<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Safe Travels</title>
</head>
<body>
	<h1>Travel Expenses</h1>
	<table>
	    <thead>
	        <tr>
	            <th class="text-center">Expense</th>
	            <th class="text-center">Vendor</th>
	            <th class="text-center">Amount</th>
	        </tr>
	    </thead>
	    <tbody>
			<c:forEach var="expense" items="${expenses}">
			
				<tr>
					<td>
					<a href="/expenses/${expense.id}"><c:out value="${expense.name}"/></a>
					</td>
					<td class="text-center">
						<c:out value="${expense.name}"></c:out>
					</td>
					<td class="text-center">
						<c:out value="${expense.vendor}"></c:out>
					</td>
					<td class="text-center">$
						<c:out value="${expense.amount}"></c:out>
					</td>
					<td class="text-center">
						<a href="/edit/${expense.id}">Edit</a>
					</td>
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
	<br>
	<div>
	<h2>Add an expense:</h2>
	<form:form action="/expenses" method="post" modelAttribute="expense">
	
		<div >
 			<form:label path="name">Product's Name:</form:label>
 			<form:errors path="name" class="error"/>
 			<form:input path="name" type="text" class="form-control" style="width:250px;"/>
    	</div>
	
		<div>
			<form:label path="vendor">Vendor:</form:label>
 			<form:errors path="vendor" class="error"/>
 			<form:input path="vendor" type="text" class="form-control" style="width:250px;"/>
		</div>
		
		<div>
			<form:label path="amount">Amount:</form:label>
 			<form:errors path="amount" class="error"/>
 			<form:input path="amount" type="double" class="form-control" style="width:250px;"/>
		</div>
		
		<div>
			<form:label path="description">Description: </form:label><br />
			<form:errors path="description" class="text-danger"/>
			<form:textarea path="description" class="form-control" style="width:250px;" rows="3" />
		</div>
		
		<div>
			<input type="submit" value="Submit" class="btn-primary"/>
		</div>
		
		
	
	</form:form>
	</div>
</body>
</html>