<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login form</title>
</head>
<body>

	<%
	
	Object login_error_aux = request.getAttribute("login_error");
	
	//Pones esto porque al pricipio cargas el documento sin pasar por el servlet, por ello 
	//pones esta primera condicion porque si no la pusieras daria error ya que boolean no puede tener el valor null
	if(login_error_aux != null){
		if((boolean) login_error_aux){
		%>
			<h3>LOGIN ERROR</h3>
		<%
		}
	}
	
	%>
	
	<form method="POST" action="/proba1/servlet/Login">
	Erabiltzailea: <input type="text" name="username"/>
	<br/>
	Pasahitza: <input type="text" name="password"/>
	<br/>
	<input type="submit"/>
	</form>


</body>
</html>