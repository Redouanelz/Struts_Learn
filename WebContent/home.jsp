<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>HOME</title>
	</head>
	
	<body style="font-family: Questrial;">
		<p>welcome home</p>
		<ul>
			<li><a href="index.jsp">index</a></li>		
			<li><a href="home.jsp">home</a></li>		
			<li><a href="login.jsp">Login</a></li>
			<li><a href="error.jsp">error</a></li>			
		</ul>
		<s:property value="username"/>		
	</body>
</html>