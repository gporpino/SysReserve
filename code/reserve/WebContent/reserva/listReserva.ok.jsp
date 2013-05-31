<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>SysReserva.com</title>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
</head>
<body>
	<div id="all">
		<div id="hd">
			<div id="titulo"><h2>Reserva</h2></div>
			<div id="apres"><span class="apres2">&nbsp;</span></div>
			<div id="menu"><%@ include file="../jsp/menu.jsp" %></div>
		</div>
		<div id="md">
			<display:table id="apartamento" name="${reservas}" pagesize="10" requestURI="reserva.listReserva.logic">
				<display:column title="Hospede" property="hospede.nome" sortable="true"></display:column>
				<display:column title="Apartamento" property="apartamento.nome" sortable="true"></display:column>
				<display:column title="inicio" property="inicio" sortable="true"></display:column>
				<display:column title="fim" property="fim" sortable="true"></display:column>
				<display:column title="Editar"><a href="reserva.registerReserva.logic?reserva.id=${reserva.id}"><img src="img/edit.png" alt="editar" title="Editar" /> </a></display:column>
				<display:column title="Excluir"><img src="img/delete.png" alt="excluir" title="Excluir" onclick="remove('formRemove', ${reserva.id});"/> </display:column>
			</display:table>
			<form action="reserva.registerReserva.logic" method="post" class="formLista" >
				<input type="submit" value="Inserir" />
			</form>
			<form action="reserva.removeReserva.logic" method="post" id="formRemove">
				<input type="hidden" value="" name="reserva.id" id="id" />
			</form> 
		</div>
		<div id="ft"><%@ include file="../jsp/footer.jsp" %></div>
	</div>
	<script type="text/javascript" src="./js/jquery.js"></script>
	<script type="text/javascript" src="./js/action.js"></script>
</body>
</html>