<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Meus Compromissos</title>
</head>
<body>
	<p>Bem vindo: ${user.login} | <a href=mainMenu>Voltar | </a><a href=logout>Sair</a><p>
	<h1>Meus Compromissos</h1>
	<table border=1>
		<tr>
			<th>Local</th>
			<th>Data</th>
			<th>Contato</th>
			<th>Descrição</th>
		</tr>

		<c:forEach var="commitments" items="${commitments}">
			<tr>
				<td>${commitments.local}</td>
				<td>${commitments.date}</td>
				<td>${commitments.contact}</td>
				<td>${commitments.description}</td>
				<td><a href=selectCommitment?id=${commitments.id}>Alterar</a></td>
				<td><a href=removeCommitment?id=${commitments.id}>Remover</a></td>
			</tr>
		</c:forEach>

		<tr>
			<td colspan=6><a href=newCommitment>Adicionar Novo</a></td>

		</tr>

	</table>

</body>
</html>