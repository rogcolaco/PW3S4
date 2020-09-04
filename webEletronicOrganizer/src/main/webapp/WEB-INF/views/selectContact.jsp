<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alterar Contato</title>
</head>
<body>
	<p>
		Bem vindo: ${user.login} | <a href=mainMenu>Voltar | </a> <a href=logout> Sair</a>
	<p>

	<c var="contacts" items="${contacts}">
		<form method=post action=updateContact>
			<p>	ID: <input type=text name=id value="${contacts.id}" readonly/>	</p>
			<p>	Nome: <input type=text name=name value="${contacts.name}" />	</p>
			<p>	Endereço: <input type=text name=adress value="${contacts.adress}" /> </p>
			<p> Telefone: <input type=text name=phone value="${contacts.phone}" /> </p>
			<p>	E-mail: <input type=text name=email value="${contacts.email}" />	</p>
			<p>	<input type=submit value="Alterar contato">	</p>
		</form>
	</c>

</body>
</html>