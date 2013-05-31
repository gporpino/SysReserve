<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Cadastro Temporada</title>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
</head>
<body>
	<div id="all">
		<div id="hd">
			<div id="titulo"><h2>Temporada</h2></div>
			<div id="apres"><span class="apres2">&nbsp;</span></div>
			<div id="menu"><%@ include file="../jsp/menu.jsp" %></div>
		</div>
		<div id="md">
			<form name="main" id="main" action="temporada.saveTemporada.logic" method="post">
				<fieldset>
					<legend>Cadastro Temporada</legend>
					<input type="hidden" value="${temporada.id}" name="temporada.id" />
        			<div id="msg"></div>
        			<fieldset>
        				<div class="requerido">* Campo Requerido</div>
        				<dl>
        					<dt><label for="nome">Nome:*</label></dt>
							<dd><input type="text" value="${temporada.nome}" name="temporada.nome" id="nome" tabindex="1" /></dd>
							<dt><label for="inicio">Inicio*</label></dt>
							<dd><input type="text" value="${temporada.inicio}" name="temporada.inicio" id="inicio" tabindex="2" /></dd>
							<dt><label for="fim">Fim*</label></dt>
							<dd><input type="text" value="${temporada.fim}" name="temporada.fim" id="inicio" tabindex="3" /></dd>
							<dt><label for="valor">Valor*</label></dt>
							<dd><input type="text" value="${temporada.valor}" name="temporada.valor" id="valor" tabindex="5" /></dd>
						</dl>					
					</fieldset>
					<div class="btn">
						<input type="button" value="Salvar" onclick="save();" tabindex="6" />
						<input type="button" value="Cancelar" onclick="back('main', 'temporada.listTemporada.logic');" tabindex="7" />
						<c:if test="${temporada.id != 0}">
							<input type="button" value="Excluir" onclick="remove('formRemove', ${temporada.id});" tabindex="8"/>
						</c:if>
					</div>
				</fieldset>
			</form>
			<form action="temporada.removeTemporada.logic" method="post" id="formRemove">
				<input type="hidden" value="" name="temporada.id" id="id" />
			</form> 
		</div>
		<div id="ft"><%@ include file="../jsp/footer.jsp" %></div>
	</div>
	<script type="text/javascript" src="./js/jquery.js"></script>
	<script type="text/javascript" src="./js/jquery.form.js"></script>
	<script type="text/javascript" src="./js/action.js"></script>
</body>
</html>