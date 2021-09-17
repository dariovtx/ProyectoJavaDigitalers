<%@page import="com.educacionit.entidades.Usuario"%>
<%@page import="com.educacionit.enumerado.Mensajes"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/button.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/form.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css" />	
<link rel="stylesheet" href="css/alert.css">
<title>Login</title>
</head>
<%
Usuario usuario = (Usuario) session.getAttribute("usuario");
if(null!= usuario){
	response.sendRedirect("index.jsp");
}

   Mensajes mensaje = (Mensajes) request.getAttribute("Mensaje");
   
%>
<body>

<% if(null!=mensaje){%>
	<div id="alert">
		<a class="alert <%= mensaje.getClaseCSS() %>" href="#alert"><%=mensaje.getMensaje() %></a>
	</div>
<%} %>
   <form action="ValidarLogin" method="post">
	 <label for="correo">Correo Electrónico:</label>
	 <input type="email" name="correo" id="correo" required>
	 <label for="correo">Clave:</label>
	 <input type="password" name="clave" id="clave" required>
	 <i class="bi bi-eye-slash" id= "verClave">Ver Clave</i>
	 <button type="submit" class="success">Enviar</button>
	 <button type="reset" class="warning">Cancelar</button> 
 
   </form>
   
<%--    <h2 style="color: red"><%=mensaje != null ? mensaje.getMensaje() : ""%> </h2> --%>
   
   <script src="scripts/Password.js"></script>
</body>
</html>













