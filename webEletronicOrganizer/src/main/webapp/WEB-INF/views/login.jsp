<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bem vindo a sua agenda eletrônica</title>
</head>
<body>
	<h1>Acesse sua agenda eletrônica</h1>
	<form method=post action=checkedLogin>
		<p> Login:<input type=text name=login /> </p> 
		<p> Senha:<input type=password name=password /> </p> 
		<p> <input type=submit value=Logar> </p> 
		<p><a href=registerUser>Cadastre-se</a></p>
	</form>
</body>
</html>