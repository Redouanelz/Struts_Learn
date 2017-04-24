<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
	<body style="font-family: Questrial;">
		<p>welcome home</p>
		<ul>
			<li><a href="index.jsp">index</a></li>		
	
			<li><a href="login.jsp">Login</a></li>

			<li><a href="home.jsp">users</a></li>		
		</ul>
		Bienvenue <s:property value="username"/>		
		<hr>
		<h1>AddUser</h1>
		<s:form action="AddUser">
			<s:textfield key="id"></s:textfield>
			<s:textfield key="nom"></s:textfield>
			<s:textfield key="prenom"></s:textfield>
			<s:textfield key="age"></s:textfield>
			<s:submit value="Add"></s:submit>
		</s:form>
		<hr>
		<h1>DeleteUser</h1>
		<s:form action="DeleteUser">
			<s:textfield key="id"></s:textfield>		
			<s:submit value="Delete"></s:submit>
		</s:form>
		
	</body>
</html>