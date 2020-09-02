<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Produtos</title>
</head>
<body>
	<p> Seja bem vindo, ${user.login} | <a href=logout>Sair</a>	</p>
	<h1>Menu Principal</h1>
	<p> <a href=myContacts>Meus Contatos</a> </p>
	<p> <a href=myCommitments>Meus Compromissos</a> </p>
	<hr>
	<p> <a href=newContact>Adicionar Novo Contato</a> </p>
	<p> <a href=newCommitment>Adicionar Novo Compromisso</a> </p>
</body>
</html>