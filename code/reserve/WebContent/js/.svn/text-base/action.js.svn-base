function save(){
	if(confirm('Confirma as alterações?')){
		var options = {
    		success: function(responseText) {
    			document.getElementById('msg').innerHTML = responseText;
    		}
		};
		$('#main').ajaxSubmit(options);
	}
}

function back(form, urlReturn){
	var obForm = (typeof form == 'string') ? document.getElementById(form) : form;
	obForm.action = urlReturn;
	obForm.submit();
}

function remove(form, value){
	if(confirm('Deseja excluir esse registro?')){
		var obForm = (typeof form == 'string') ? document.getElementById(form) : form;
		document.getElementById('id').value = value;
		obForm.submit();
	}
}

function verificar(){
	/*var options = {
    	success: function(responseText) {
    		alert("Achou!!!");
    		$('#apartamentos').innerHTML = responseText;
    	}
	};
	alert(document.main.action);
	document.main.action = 'reserva.listApartamentosDisponiveis.logic';
	alert(document.main.action);
	$('#main').ajaxSubmit(options);
	*/
	var params = "reserva.inicio='"+ document.getElementById('inicio').value +
	             "'&reserva.fim='" + document.getElementById('fim').value + '';
	alert(params); 
	$.ajax({
  		type: "POST",
  		url: "reserva.listApartamentosDisponiveis.logic",
  		data: params,
  		success: function(msg){
    		alert(msg );
  		}
	});
}
