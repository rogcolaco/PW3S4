<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar novo Contato</title>
</head>
<body>
	<p> Bem vindo: ${user.login} | <a href=mainMenu>Voltar</a>  |  <a href=logout>Sair</a> <p>
	<h1>Informe os dados do Novo contato</h1>
	<form method=post action=registerNewContact>
		<p> Nome: <input type=text name=name /> </p> 
		<p> Endereço: <input type=text name=adress /> </p>  
		<p> Telefone: <input type=text name=phone /> </p> 
		<p> E-mail: <input type=text name=email /> </p> 
		<p> <input type=submit value="Salvar novo contato"> </p> 
	</form>
</body>
</html>