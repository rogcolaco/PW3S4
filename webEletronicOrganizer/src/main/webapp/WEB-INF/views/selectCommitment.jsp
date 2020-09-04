<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alterar Compromisso</title>
</head>
<body>
	<p>
		Bem vindo: ${user.login} | <a href=mainMenu>Voltar | </a> <a href=logout> Sair</a>
	<p>

	<c var="commitments" items="${commitments}">
		<form method=post action=updateCommitment>
			<p>	ID: <input type=text name=id value="${commitments.id}" readonly/>	</p>
			<p>	Local: <input type=text name=name value="${commitments.local}" />	</p>
			<p>	Data: <input type=text name=adress value="${commitments.date}" /> </p>
			<p> Contato: <input type=text name=phone value="${commitments.contact}" /> </p>
			<p>	Descrição: <input type=text name=email value="${commitments.description}" />	</p>
			<p>	<input type=submit value="Alterar Compromisso">	</p>
		</form>
	</c>

</body>
</html>