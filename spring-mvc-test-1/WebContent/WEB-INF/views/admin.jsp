<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body>
	<form action="addUser" method="post">
		 <input type="text" id="userName" name= "userName"/>
		  <input type="text" id="password" name= "password"/>
		<br> 
		<input type="submit" value="Kaydet">
	</form>
	<h3>${msg}</h3>
	Name : ${name}
</body>
</html>