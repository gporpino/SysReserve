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
			<div id="titulo"><h2>Hospede</h2></div>
			<div id="apres"><span class="apres2">&nbsp;</span></div>
			<div id="menu"><%@ include file="../jsp/menu.jsp" %></div>
		</div>
		<div id="md">
			<form name="main" id="main" action="hospede.saveHospede.logic" method="post">
				<fieldset>
					<legend>Cadastro Hospede</legend>
					<input type="hidden" value="${hospede.id}" name="hospede.id"/>
        			<div id="msg"></div>
        			<fieldset>
        				<div class="requerido">* Campo Requerido</div>
        				<dl>
        					<dt><label for="nome">Nome:*</label></dt>
							<dd><input type="text" value="${hospede.nome}" name="hospede.nome" id="nome" tabindex="1"/></dd>
							<dt><label for="cpf">CPF:*</label></dt>
							<dd><input type="text" value="${hospede.cpf}" name="hospede.cpf" id="cpf" tabindex="2" maxlength="11" class="numero"/></dd>
							<dt><label for="rg">R.G.:</label></dt>
							<dd><input type="text" value="${hospede.rg}" name="hospede.rg" id="rg" tabindex="3" maxlength="7" class="numero"/></dd>
						</dl>
						
						<dl>
        					<dt><label for="logradouro">Logradouro:*</label></dt>
							<dd><input type="text" value="${hospede.endereco.logradouro}" name="hospede.endereco.logradouro" id="logradouro" tabindex="4"/></dd>
							<dt><label for="bairro">Bairro:*</label></dt>
							<dd><input type="text" value="${hospede.endereco.bairro}" name="hospede.endereco.bairro" id="bairro" tabindex="5"/></dd>
							<dt><label for="cidade">Cidade:*</label></dt>
							<dd><input type="text" value="${hospede.endereco.cidade}" name="hospede.endereco.cidade" id="cidade" tabindex="6"/></dd>
							<dt><label for="uf">U.F.:*</label></dt>
							<dd><input type="text" value="${hospede.endereco.uf.nome}" name="hospede.endereco.uf.nome" id="uf" tabindex="7"/></dd>
						</dl>
						
						<dl>
        					<dt><label for="foneResidencial">Fone Residencial:*</label></dt>
							<dd><input type="text" value="${hospede.foneResidencial}" name="hospede.foneResidencial" id="foneResidencial" tabindex="8" maxlength="11" class="numero"/></dd>
							<dt><label for="foneCelular">Celular:</label></dt>
							<dd><input type="text" value="${hospede.foneCelular}" name="hospede.foneCelular" id="foneCelular" tabindex="9" maxlength="11" class="numero"/></dd>
							<dt><label for="foneContato">Fone de Contato:</label></dt>
							<dd><input type="text" value="${hospede.foneContato}" name="hospede.foneContato" id="foneContato" tabindex="10" maxlength="11" class="numero"/></dd>
						</dl>
					</fieldset>
					<div class="btn">
						<input type="button" value="Salvar" onclick="save();" tabindex="11"/>
						<input type="button" value="Voltar" onclick="back('main', 'hospede.listHospede.logic');" tabindex="12"/>
						<c:if test="${hospede.id != 0}">
							<input type="button" value="Excluir" onclick="remove('formRemove', ${hospede.id});" tabindex="13"/>
						</c:if>
					</div>
				</fieldset>
			</form>
			<form action="hospede.removeHospede.logic" method="post" id="formRemove">
				<input type="hidden" value="" name="hospede.id" id="id" />
			</form> 
		</div>
		<div id="ft"><%@ include file="../jsp/footer.jsp" %></div>
	</div>
	<script type="text/javascript" src="./js/jquery.js"></script>
	<script type="text/javascript" src="./js/jquery.form.js"></script>
	<script type="text/javascript" src="./js/action.js"></script>
</body>
</html>