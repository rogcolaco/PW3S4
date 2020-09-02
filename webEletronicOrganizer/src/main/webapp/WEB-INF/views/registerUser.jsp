<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar novo usuário</title>
</head>
<body>
	<h1>Por favor preencha os campos abaixo</h1>
	<form method=post action=registerUser>
		<p> Login:<input type=text name=login /> </p> 
		<p> Senha:<input type=password name=password /> </p> 
		<p> <input type=submit value="Salvar novo usuário"> </p> 
	</form>
</body>
</html>