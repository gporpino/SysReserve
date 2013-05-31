<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Cadastro Apartamento</title>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
</head>
<body>
	<div id="all">
		<div id="hd">
			<div id="titulo"><h2>Apartamento</h2></div>
			<div id="apres"><span class="apres2">&nbsp;</span></div>
			<div id="menu"><%@ include file="../jsp/menu.jsp" %></div>
		</div>
		<div id="md">
			<form name="main" id="main" action="apartamento.saveApartamento.logic" method="post">
				<fieldset>
					<legend>Cadastro Apartamento</legend>
					<input type="hidden" value="${apartamento.id}" name="apartamento.id" />
        			<div id="msg"></div>
        			<fieldset>
        				<div class="requerido">* Campo Requerido</div>
        				<dl>
        					<dt><label for="nome">Nome:*</label></dt>
							<dd><input type="text" value="${apartamento.nome}" name="apartamento.nome" id="nome" tabindex="1" /></dd>
							<dt><label for="tipo">Tipo:*</label></dt>
							<dd>
								<select name="apartamento.tipo.id" id="tipo" tabindex="2">
									<c:forEach var="tipo" items="${listaTipo}">
										<option value="${tipo.id}" <c:if test="${apartamento.tipo.id == tipo.id}">selected="true"</c:if>>
											${tipo.nome}
										</option>
									</c:forEach>
								</select>
							</dd>
						</dl>					
					</fieldset>
					<div class="btn">
						<input type="button" value="Salvar" onclick="save();" tabindex="3" />
						<input type="button" value="Cancelar" onclick="back('main', 'apartamento.listApartamento.logic');" tabindex="4" />
						<c:if test="${apartamento.id != 0}">
							<input type="button" value="Excluir" onclick="remove('formRemove', ${apartamento.id});" tabindex="5"/>
						</c:if>
					</div>
				</fieldset>
			</form>
			<form action="apartamento.removeApartamento.logic" method="post" id="formRemove">
				<input type="hidden" value="" name="apartamento.id" id="id" />
			</form> 
		</div>
		<div id="ft"><%@ include file="../jsp/footer.jsp" %></div>
	</div>
	<script type="text/javascript" src="./js/jquery.js"></script>
	<script type="text/javascript" src="./js/jquery.form.js"></script>
	<script type="text/javascript" src="./js/action.js"></script>
</body>
</html>