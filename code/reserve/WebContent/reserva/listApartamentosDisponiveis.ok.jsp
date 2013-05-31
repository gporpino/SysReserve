<display:table id="apartamento" name="${apartamentos}" pagesize="10" requestURI="reserva.listApartamentosDisponiveis.logic">
	<display:column title="Apartamento" property="apartamento.nome" sortable="true"></display:column>
	<display:column title="Tipo" property="apartamento.tipo.nome" sortable="true"></display:column>
	<display:column title="Excluir"><img src="img/delete.png" alt="excluir" title="Excluir" onclick="remove('formRemove', ${reserva.id});"/> </display:column>
</display:table>