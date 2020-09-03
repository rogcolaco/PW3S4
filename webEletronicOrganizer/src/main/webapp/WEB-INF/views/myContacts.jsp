<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Meus Contatos</title>
</head>
<body>
<p> Bem vindo: ${user.login} | <a href=mainMenu>Voltar | </a><a href=logout>Sair</a> <p>
<h1>Meus Contatos</h1>
<table border=1>
	<tr>
		<th>Nome</th>
		<th>Endereço</th>
		<th>Telefone</th>
		<th>E-mail</th>
	</tr>

<c:forEach var="contacts" items="${contacts}">
	<tr>
		<td>${contacts.name}</td>
		<td>${contacts.adress}</td>
		<td>${contacts.phone}</td>
		<td>${contacts.email}</td>
		<td><a href=loja?acao=AlterarProduto&id=${produto.id}>Alterar</a></td>
		<td><a href=removeContact?id=${contacts.id}>Remover</a></td>
	</tr>
</c:forEach>

<tr>
	<td colspan=6><a href=newContact>Adicionar Novo</a></td>

</tr>

</table>

</body>
</html>