<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buscador de productos</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>

<body>
	<div class="container-fluid m-4">
		<h1>Bienvenido al consumo de API en Prueba de ensayo</h1><br>
		<h3>Listado de clientes desde la API Rest</h3>
		<br>
		
			<br>

			<table class="table table-striped mt-3">
				<thead>

					<tr>
						<th scope="col">Nombre compañía</th>
						<th scope="col">Dirección</th>
						<th scope="col">Ciudad</th>
						<th scope="col">País</th>
						<th scope="col">Teléfono</th>
						<th scope="col">Correo</th>
					</tr>

				</thead>
				<tbody>
					<c:forEach items="${listaClientes}" var="clienteI">
						<tr>

							<td><c:out value="${clienteI.getNombreCompania()}"></c:out></td>
							<td><c:out value="${clienteI.getDireccion()}"></c:out></td>
							<td><c:out value="${clienteI.getCiudad()}"></c:out></td>
							<td><c:out value="${clienteI.getPais()}"></c:out></td>
							<td><c:out value="${clienteI.getTelefono()}"></c:out></td>
							<td><c:out value="${clienteI.getMail()}"></c:out></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>


	
	</div>
</body>
</html>