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
			<div id="titulo"><h2>Serviço</h2></div>
			<div id="apres"><span class="apres2">&nbsp;</span></div>
			<div id="menu"><%@ include file="../jsp/menu.jsp" %></div>
		</div>
		<div id="md">
			<display:table id="servico" name="${servicos}" pagesize="9" requestURI="servico.listServico.logic">
				<display:column title="Nome" property="nome" sortable="true"></display:column>
				<display:column title="Valor" property="valor" sortable="true"></display:column>
				<display:column title="Editar"><a href="servico.registerServico.logic?servico.id=${servico.id}"><img src="img/edit.png" alt="editar" title="Editar" /> </a></display:column>
				<display:column title="Excluir"><img src="img/delete.png" alt="excluir" title="Excluir" onclick="remove('formRemove', ${servico.id});"/> </display:column>
			</display:table>
			<form action="servico.registerServico.logic" method="post" class="formLista" >
				<input type="submit" value="Inserir" />
			</form>
			<form action="servico.removeServico.logic" method="post" id="formRemove">
				<input type="hidden" value="" name="servico.id" id="id" />
			</form> 
		</div>
		<div id="ft"><%@ include file="../jsp/footer.jsp" %></div>
	</div>
	<script type="text/javascript" src="./js/jquery.js"></script>
	<script type="text/javascript" src="./js/action.js"></script>
</body>
</html>