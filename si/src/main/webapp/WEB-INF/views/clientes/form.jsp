<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario</title>
</head>
<body>
	<form action="/si/clientes" method="post">
		<div>
			<label>Nome</label>
			<input type="text" name="nome">	
		</div>
		<div>
			<label>Endereço</label>
			<textarea rows="10" cols="20" name="endereco"></textarea>
		</div>
		<div>
			<label>CPF</label>
			<input type="text" name="cpf">
		</div>
		<div>
			<label>Telefone</label>
			<input type="text" name="telefone">
		</div>
		<button type="submit">Cadastrar</button>
	</form>
</body>
</html>