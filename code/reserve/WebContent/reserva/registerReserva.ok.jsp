<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Cadastro Reserva</title>
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
			<form name="main" id="main" action="reserva.saveReserva.logic" method="post">
				<fieldset>
					<legend>Cadastro Reserva</legend>
					<input type="hidden" value="${reserva.id}" name="reserva.id" />
        			<div id="msg"></div>
        			<fieldset>
        				<div class="requerido">* Campo Requerido</div>
        				<dl>
        					<dt><label for="inicio">Inicio:*</label></dt>
							<dd><input type="text" value="${reserva.inicio}" name="reserva.inicio" id="inicio" tabindex="1" /></dd>
							<dt><label for="fim">Fim:*</label></dt>
							<dd><input type="text" value="${reserva.fim}" name="reserva.fim" id="fim" tabindex="2" /></dd>
						</dl>
						<div class="btn">
						  <input type="button" value="Verificar" onclick="verificar();" tabindex="3" />
					    </div>					
					</fieldset>
					<div id="apartamentos"></div>
					<div class="btn">
						<input type="button" value="Salvar" onclick="save();" tabindex="4" />
						<input type="button" value="Cancelar" onclick="back('main', 'reserva.listReserva.logic');" tabindex="5" />
						<c:if test="${reserva.id != 0}">
							<input type="button" value="Excluir" onclick="remove('formRemove', ${reserva.id});" tabindex="6"/>
						</c:if>
					</div>
				</fieldset>
			</form>
			<form action="reserva.removeReserva.logic" method="post" id="formRemove">
				<input type="hidden" value="" name="reserva.id" id="id" />
			</form> 
		</div>
		<div id="ft"><%@ include file="../jsp/footer.jsp" %></div>
	</div>
	<script type="text/javascript" src="./js/jquery.js"></script>
	<script type="text/javascript" src="./js/jquery.form.js"></script>
	<script type="text/javascript" src="./js/action.js"></script>
</body>
</html>