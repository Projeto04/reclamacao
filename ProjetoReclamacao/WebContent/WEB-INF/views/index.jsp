<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="cadastroCidadao" method="post" >
		
		Nome:<input type="text" name="nome" /> <br/>
		cpf:<input type="text" name="cpf" /> <br/>
		usuario:<input type="text" name="usuario" /> <br/>
		senha:<input type="text" name="senha" /> <br/>
		endereco:<input type="text" name="endereco" /> <br/>
		<input type="hidden" name="area.id" value="1"/>
		
		<input type="submit"/> <br/>
		<a href="formBuscaCidadao">Buscar Usuario</a>
	</form>
</body>
</html>