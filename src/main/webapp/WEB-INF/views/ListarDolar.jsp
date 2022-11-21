<%@page import="entities.Dolar"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns:th="http://thymelesf.org">
<head>
<meta charset="ISO-8859-1">
<title>Listado del Dolar</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
<script defer="defer" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.5.3/js/bootstrapValidator.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
</head>
<body style="background-color: #f0f8ff;">
<div class="Container">
<br>
<h1>Listar Los registros del Dolar</h1>
<br>

	<form>
		<div style="display: flex; gap: 1rem;">
		
		<label class="col-sm-2 col-form-label ">Buscar :</label>
		<input type="text" id="txtBuscar">
		</div>
	</form>
	
<br>
<button type="button" class="btn btn-outline-info" onclick="filtar();">Buscar</button>
<a class="btn btn-outline-info" href="RegistroDolar">REGISTRAR</a>
<button type="button" class="btn btn-outline-warning" onclick="limpiar();">LIMPIAR</button>
<br>

<br>
        <div>
            <table class="table">
                <thead >
                <tr class="table-info">
                    <th scope="col">ID</th>
                    <th scope="col">Valor del Dolar</th>
                    <th scope="col">Fecha Registrada</th>
                    <th scope="col"></th>
                    <th scope="col"></th>
                </tr>
                </thead>
                <tbody>
                <%
                List<Dolar> lista=(List<Dolar>)request.getAttribute("dolar");
                for(Dolar dol:lista){ %>
                <tr  class="table-warning">
                    <td><%=dol.getIN_ID_TCDolarXdia()%></td>
                    <td><%=dol.getDC_TIPCAMB()%></td>
                    <td><%=dol.getDT_FEC_REG() %></td>                    
                    </tr>
                <%} %>
                </tbody>
            </table>
            
        </div>


</div>
</body>
</html>