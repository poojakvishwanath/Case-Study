<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>On Demand Car Service</title>
</head>
<body>
<center>
<h1 style="color: #0066CC">Login Details</h1>
	<h3>Please Enter the Login Details</h3>
			<table bgcolor="#DCDCDC">
		<form:form action="success" method="POST" modelAttribute="login">
					<tr>
				<th>User Id:<span style="color: red;">*</span></th>
				<td><form:input path="userId" /></td>
				<td style="color: red;"><form:errors path="userId"></form:errors></td>
			</tr>
		    <tr>
				<th>User Name:<span style="color: red;">*</span></th>
				<td><form:input path="userName" /></td>
				<td style="color: red;"><form:errors path="userName"></form:errors></td>
			</tr>
			
			<tr>
				<th>Password:<span style="color: red;">*</span></th>
				<td><form:input path="password" /></td>
				<td style="color: red;"><form:errors path="password"></form:errors></td>
			</tr>
			<tr>
				<td><input type="submit" value="Details"></input></td>
			</tr>
			<a href="home">Click here to go back</a><br/>
		</form:form>
	</table>
	</center>
</body>
</html>