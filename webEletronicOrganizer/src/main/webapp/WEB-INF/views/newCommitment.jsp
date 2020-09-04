<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar novo Compromisso</title>
</head>
<body>
	<p> Bem vindo: ${user.login} | <a href=mainMenu>Voltar | </a><a href=logout> Sair</a> <p>
	<h1>Informe os dados do Novo Compromisso</h1>
	<form method=post action=registerNewCommitment>
		<p> Local: <input type=text name=local /> </p> 
		<p> Data: <input type=date name=date /> </p>  
		<p> Contato: <input type=text name=contact /> </p> 
		<p> Descrição: <input type=text width="200" height="100" name=description /> </p> 
		<p> <input type=submit value="Salvar novo contato"> </p> 
	</form>

</body>
</html>