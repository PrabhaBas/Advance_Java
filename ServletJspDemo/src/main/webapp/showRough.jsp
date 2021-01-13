<%@page import="com.prabha.web.model.Rough"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="skyblue">

<%
Rough r1 =(Rough) request.getAttribute("rough");

out.println(r1);
%>

</body>
</html>