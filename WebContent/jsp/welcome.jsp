<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>

	<%

	String username = (String) session.getAttribute("username"); 
	
	if(username == null){%>
	
		<a href="/proba1/jsp/login_form.jsp">Log in</a>
	<%
	}
	else{
		%>
		<h3>ONGI ETORRI, <%=username %>
		<%
	}
	%>
		
</body>
</html>