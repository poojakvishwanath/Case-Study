<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1 style="color: #0066CC">View User Details</h1>
		<br />
		<br />
<table bgcolor="#DCDCDC">

<form:form action="modifyProfile" method="POST" modelAttribute="login">
<tr>
<th>Login ID:</th><td><form:input path="userId"/></td></tr>
<tr><td><input type="submit" value="view profile"></input></td></tr>
<a href="home">Click here to go back</a><br/>
</form:form>
</table>
</center>
</body>
</html>