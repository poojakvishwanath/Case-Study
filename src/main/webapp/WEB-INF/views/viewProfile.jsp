<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Profile Details</title>
</head>
<body>
<table bgcolor="#DCDCDC" border="1">
		<tr>
			<th>User Name:</th>
			<td>${login.userName}</td>
		</tr>
	
		<tr>
			<th>User Password:</th>
			<td>${login.password}</td>
		</tr>
		
	</table>
	<a href="home">Click here to go back</a>
	<br />

</body>
</html>