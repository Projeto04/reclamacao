<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Cidadao(TEST)</title>
</head>
<body>
	<form action="cadastroCidadao" method="post" >
		
		Nome:<input type="text" name="nome" required/> <br/>
		cpf:<input type="text" name="cpf" required/> <br/>
		dataNascimento:<input type="date" name="dataNascimento" required/> <br/>
		genero:
		<select  name="sexo" >
			<option value="MASCULINO">MASCULINO</option>
			<option value="FEMININO">FEMININO</option>
		</select> 
		<br/>
		usuario:<input type="text" name="username" required  /> <br/>
		senha:<input type="password" name="senha" id="password" required/>
		<input type="checkbox" id="btnPassword" /> <br/>
		
		<hr/>
		<h3>endereco:</h3>
		logradouro:<input type="text" name="endereco.logradouro" required/> <br/>
		numero:<input type="number" name="endereco.numero" /> <br/>
		complemento:<input type="text" name="endereco.complemento" /> <br/>
		cep:<input type="text" name="endereco.cep" required/> <br/>
		cidade:<input type="text" name="endereco.cidade" required /> <br/>
		estado:<input type="text" name="endereco.estado" required /> <br/>
		
		<input type="hidden" name="area.id" value="1"/>
		
		<input type="submit"/> <br/>
		<a href="formBuscaCidadao">Buscar Usuario</a>
	</form>
	<script type="text/javascript">
		var btn = document.getElementById("btnPassword");
		
		btn.onclick = function(){
			 var inputPassword = document.getElementById("password");
			 
			 if( inputPassword.type == "text" ){
				 inputPassword.type = "password";
			 }
			 else{
				 inputPassword.type = "text";
			 }
		};
	</script>
</body>
</html>