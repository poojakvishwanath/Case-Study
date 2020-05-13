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
	<h3>Opt for the service</h3>
	
		<form:form action="serviceOrder" method="POST" modelAttribute="service">
		<br><br>  
        services:  
        Car Wash<form:checkbox path="washServices" value="carwash"/>  
        Car wipe<form:checkbox path="washServices" value="carwipe"/>  
        clean and dress<form:checkbox path="washServices" value="cleanAndDress"/>  
        <br><br>  
				
		<input type="submit" value="Order"></input>
			
			</br>
			
		</form:form>
		<a href="carService">Click here to go back</a><br/>
	
	</center>

</body>
</html>