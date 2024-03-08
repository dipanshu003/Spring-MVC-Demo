<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
	
	<div class = "container" style="width: 100%; text-align: center;">
	
	<h1>Login Form</h1>
	
		<form action="login" method="post">
		Email : <input type="email" name = "email1" required/><br>
		Password : <input type="password" name = "pass1" required/><br><br>
		<input type="submit" value="Login">
		<br><br>
		<a href="register.jsp">New User</a>
		</form>
	</div>
</body>
</html>