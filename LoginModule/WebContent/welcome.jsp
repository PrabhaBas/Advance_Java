<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<%

response.setHeader("Cache-Control","no-cache,no-store,must-revalidate"); // Http 1.1
//response.setHeader("Pragma","no-cache"); // Http 1.0
//response.setHeader("Expires","0"); // Proxies

String username = (String)session.getAttribute("uname");
System.out.println(username);
if(username==null)
{
	System.out.println("Welcome  check enter");
	response.sendRedirect("login.jsp");
}

%>
		Welcome ${uname}...<br>
		
<br><a href="videos.jsp">Video's Page</a> <br>
<br><a href="aboutus.jsp">About us Page</a>
<br>



</body>
</html>