<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Video's Page</title>
</head>
<body>
	<%
	response.setHeader("Cache-Control","no-cache, no-store, must-revalidate"); // Http 1.1
//	response.setHeader("Pragma","no-cache"); // Http 1.0
	//response.setHeader("Expires","0"); // Proxies
	
	
	%>
	
	<iframe width="300" height="300" src="videos/mov_bbb.mp4">
	
	</iframe>	
	
	
	<br><a href="aboutus.jsp">About us Page</a>
	
	<form action="Logout">
	<input type="submit" value="Logout">

</form>
</body>
</html>