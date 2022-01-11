<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>JSP Tutorial + scripting tags</h1>
<%= "Welcome. " %>
<% out.print("Enter name\n"); %>
<form action="welcome.jsp">
<input type="text" name = "uname">
<input type="submit" value="go"><br/>
</form>
</body>
</html>