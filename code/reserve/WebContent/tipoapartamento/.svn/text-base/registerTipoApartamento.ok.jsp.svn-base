<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>SysReserva.com</title>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
</head>
<body>
	<div id="all">
		<div id="hd">
			<div id="titulo"><h2>Tipo Apartamento</h2></div>
			<div id="apres"><span class="apres2">&nbsp;</span></div>
			<div id="menu"><%@ include file="../jsp/menu.jsp" %></div>
		</div>
		<div id="md">
			<form name="main" id="main" action="tipoapartamento.saveTipoApartamento.logic" method="post">
				<fieldset>
					<legend>Cadastro Tipo Apartamento</legend>
					<input type="hidden" value="${tipoApartamento.id}" name="tipoApartamento.id" id="id"/>
					<div id="msg"></div>
        			<fieldset>
        				<div class="requerido">* Campo Requerido</div>
        				<dl>
        					<dt><label for="nome">Nome:*</label></dt>
							<dd><input type="text" value="${tipoApartamento.nome}" name="tipoApartamento.nome" id="nome" tabindex="1"/></dd>
							<dt><label for="camas">Qtd. Camas:*</label></dt>
							<dd><input type="text" value="${tipoApartamento.qtdCamas}" name="tipoApartamento.qtdCamas" id="camas" tabindex="2" class="numero"/></dd>
							<dt><label for="taxa">Taxa:*</label></dt>
							<dd><input type="text" value="${tipoApartamento.taxa}" name="tipoApartamento.taxa" id="taxa" tabindex="3" class="numero"/></dd>
						</dl>
					</fieldset>
					<div class="btn">
						<input type="button" value="Salvar" onclick="save();" tabindex="4"/>
						<input type="button" value="Voltar" onclick="back('main', 'tipoapartamento.listTipoApartamento.logic');" tabindex="5"/>
						<c:if test="${tipoApartamento.id != 0}">
							<input type="button" value="Excluir" onclick="remove('formRemove', 'tipoapartamento.removeTipoApartamento.logic', ${tipoApartamento.id});" tabindex="6"/>
						</c:if>
					</div>
				</fieldset>
			</form>	
		</div>
		<div id="ft"><%@ include file="../jsp/footer.jsp" %></div>
	</div>
	<script type="text/javascript" src="./js/jquery.js"></script>
	<script type="text/javascript" src="./js/jquery.form.js"></script>
	<script type="text/javascript" src="./js/action.js"></script>
</body>
</html>