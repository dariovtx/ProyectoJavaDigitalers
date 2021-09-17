<%@page import="com.educacionit.interfaces.Fechas"%>
<%@page import="com.educacionit.entidades.Documento"%>
<%@page import="com.educacionit.entidades.Alumno"%>
<%@page import="com.educacionit.implementaciones.mariadb.AlumnoImplementacion"%>
<%@page import="com.educacionit.entidades.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/form.css">
<link rel="stylesheet" href="css/button.css">
<title>ABM alumnos </title>
<%!private AlumnoImplementacion alumnoImplementacion = new AlumnoImplementacion();%>
</head>
<%
	 Usuario usuario =(Usuario) session.getAttribute("usuario");
	if(null==usuario){
		response.sendRedirect("login.jsp");
	} 
	
	String tipoDocumento = request.getParameter("tipoDocumento");
	String numeroDocumento = request.getParameter("numeroDocumento");
	Boolean editar = Boolean.parseBoolean(request.getParameter("editar"));
	Alumno alumno = null;
 if(null != tipoDocumento && null != numeroDocumento && editar){
	alumno = alumnoImplementacion.buscar(new Documento(tipoDocumento,numeroDocumento));	
}
%>
<body>
<header>
		<h1>Digitalers - Educacion IT</h1>
		<img alt="" src="images/logo-it.svg" width="200" height="50">

	</header>
<nav>
    <a href="index.jsp">Lista de Alumnos</a>
    <a href="ValidarLogin?cerrarSesion=true">Cerrar Sesión</a>		
	</nav>
	
<form action="alumnoABM" method="post">

	<%if(!editar){ %>
	<select name="tipoDocumento" required <%=null!=editar && editar ? "readonly":"" %> >
		<option value=" ">Seleccione un Documento</option>
		<option value="DNI"  >DNI</option>
		<option value="PAS"  >PAS</option>
		<option value="LE"  >LE</option>
		<option value="CI"  >CI</option>
	</select>
	<%}else{ %>
	<input type="text" name="tipoDocumento" value="<%=editar?alumno.getDocumento().getTipo():"" %>" readonly required>
	<%} %>
	<input type="text" name="numeroDocumento" value="<%=editar?alumno.getDocumento().getNumero():"" %>" <%=null!=editar && editar ? "readonly":"" %> required>
	<input type="text" name="descripcion" value="<%=editar?alumno.getDescripcion():"" %>" required>
	<input type="date" name="fechaNacimiento" value="<%=editar?Fechas.getFechaSQLAString(alumno.getFecha_nacimiento()):""%>" required>
	<select name="activo" required>
		<option value="">Seleccone una Opción</option>
		<option value="true" <%=editar && alumno.getActivo()?"selected":""%> >Activo</option>
		<option value="false" <%=editar && alumno.getActivo()?"":"selected"%> >Inactivo</option>		
	</select>
	
	 <button type="submit" class="success">Enviar</button>
	 <button type="reset" class="warning">Limpiar</button>
</form>
<footer>
Creado por Darío V. Barboso.
</footer>
</body>
</html>