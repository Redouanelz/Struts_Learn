<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body style="font-family: Questrial;">
<p>Login</p>
		<ul>
		<li><a href="index.jsp">index</a></li>		
			<li><a href="home.jsp">home</a></li>		
			<li><a href="login.jsp">Login</a></li>
			<li><a href="error.jsp">error</a></li>				
		</ul>
	<s:form action="login.action">
		<s:textfield label="nom d'utilisateur(*)" key="username"></s:textfield>
		<s:password label="mot de passe(*)"  key="password"></s:password>
		<s:submit value="Se Connecter" />
	</s:form >
	
</body>
</html>