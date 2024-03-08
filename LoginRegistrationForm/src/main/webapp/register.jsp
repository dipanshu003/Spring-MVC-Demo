<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<div class = "container" style="width: 100%; text-align: center;">
<h1>Registration Form</h1>
<br>
	<form action="register" method="post">
		Name : <input type="text" name = "name1"/><br>
		Email : <input type="email" name = "email1"/><br>
		Password : <input type="password" name = "pass1"/><br><br>
		
		City : <select name = "city1">
			<option value="">Select City</option>
			<option value="Pune">Pune</option>
			<option value="Mumbai">Mumbai</option>
			<option value="Surat">Surat</option>
			<option value="Lucknow">Lucknow</option>
			
		</select>
		<br><br>
		<input type="submit" value="Submit">
	</form>
</div>	
	
</body>
</html>