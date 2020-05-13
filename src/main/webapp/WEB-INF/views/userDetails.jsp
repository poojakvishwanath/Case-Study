<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1 style="color: #0066CC">Details</h1>
	<h3>Please Enter the service Details</h3>
			<table bgcolor="#DCDCDC">
		<form:form action="serviceDetails" method="POST" modelAttribute="login">
					<tr>
				<th>Card Number:<span style="color: red;">*</span></th>
				<td><form:input path="cardNumber" /></td>
				<td style="color: red;"><form:errors path="cardNumber"></form:errors></td>
			</tr>
		    <tr>
				<th>Account Name:<span style="color: red;">*</span></th>
				<td><form:input path="accountName" /></td>
				<td style="color: red;"><form:errors path="accountName"></form:errors></td>
			</tr>
			
			<tr>
				<th>Cvv Number:<span style="color: red;">*</span></th>
				<td><form:input path="cvvNumber" /></td>
				<td style="color: red;"><form:errors path="cvvNumber"></form:errors></td>
			</tr>
			<tr>
				<th>Validity Date:<span style="color: red;">*</span></th>
				<td><form:input path="validityDate" /></td>
				<td style="color: red;"><form:errors path="cvvNumber"></form:errors></td>
			</tr>
			<tr>
				<th>Address:<span style="color: red;">*</span></th>
				<td><form:input path="loationAddress" /></td>
				<td style="color: red;"><form:errors path="cvvNumber"></form:errors></td>
			</tr>
			<tr>
				<th>Car Number:<span style="color: red;">*</span></th>
				<td><form:input path="carNumber" /></td>
				<td style="color: red;"><form:errors path="cvvNumber"></form:errors></td>
			</tr>
			
			
			<tr>
				<td><input type="submit" value="serviceDetails"></input></td>
			</tr>
			<a href="home">Click here to go back</a><br/>
		</form:form>
	</table>
	</center>

</body>
</html>