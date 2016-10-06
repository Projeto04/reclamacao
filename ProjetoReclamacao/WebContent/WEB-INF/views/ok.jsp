<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Response:</p>
	Id: ${user.id} <br/>
	Nome: ${user.nome} <br/>
	Tipo: ${user.tipo} <br/>
	AreaDeAtuacao: ${user.area.nome}<br/>
</body>
</html>