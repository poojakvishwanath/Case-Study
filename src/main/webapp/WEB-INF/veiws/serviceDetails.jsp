<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table bgcolor="#DCDCDC" border=1>
		<form:form action="updateClaimExpense" method="POST" modelAttribute="bean">
			<tr>
				<th>Claim Code:</th>
				<td><form:input path="claimCode" /></td>
				<td style="color: red;"></td>
			</tr>
			
			<tr>
				<th>Employee code:</th>
				<td><form:input path="employeeId" /></td>
				<td style="color: red;"></td>
			</tr>
			
		<tr>
				<th>Project Code:</th>
				<td><form:input path="projectCode" /></td>
				<td style="color: red;"></td>
			</tr>
			<tr>
				<th>Expense Code:</th>
				<td><form:input path="expenseCode" /></td>
				<td style="color: red;"></td>
			</tr>
			<tr>
				<th>Start Date:</th>
				<td><form:input path="startDate" type="date" /></td>
				
			<tr>
				<th>End Date:</th>
				<td><form:input path="endDate" type="date" /></td>
				
			<tr>
				<th>Expense Amount:</th>
				<td><form:input path="expenseAmount" /></td>
				
			<tr>
			<tr>
				<td><input type="submit" value="Claim Expense"></input></td>
			</tr>
			<br />
			<a href="home">Click here to go back</a>
			<br />
		</form:form>
	</table>
	
</body>
</html>