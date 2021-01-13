<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<style>
form{
border: 2px solid ;
padding: 70px;
margin: 60px;
}

</style>

</head>
<body bgcolor="pink">
<h1>Register</h1>
	
<form action="Registration" method="post">
		<br>Username		 :<input type="text" name="uname" ><br>
		<br>Mail id			 :<input type="email" name="umail"><br>
		<br>Phone No		 :<input type="text" name="uphone"><br>
		<br>Password		 :<input type="password" name="upass" ><br>
		<br>Confirm Password         :<input type="password" name="ucpass" ><br>					
					<br><input type="submit" value="register">
</form>
		
		
		

</body>
</html>