<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buscar Contato</title>
</head>
<body>
	<p>Bem vindo: ${user.login} | <a href=mainMenu>Voltar</a>  |  <a href=logout>Sair</a> <p>
	<h1>Buscar Contato</h1>
	<form method=post action=myContactsFiltred>
		<p> Nome: <input type=text name=name /> </p> 
		<p> <input type=submit value="Buscar"> </p> 
	</form>

</body>
</html>