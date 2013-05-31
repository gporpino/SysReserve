package br.fir.labpoo.ccg.reserve.controller;

import java.util.Collection;

import org.vraptor.annotations.Component;

import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.facade.Facade;
import br.fir.labpoo.ccg.reserve.model.TipoApartamento;

@Component
public class TipoApartamentoAction {
	private Collection<TipoApartamento> tipoApartamentos;
	private TipoApartamento tipoApartamento;
	private Facade facade;
	
	public TipoApartamentoAction(){
		this.facade = Facade.getInstacia();
	}
	public Collection<TipoApartamento> getTipoApartamentos() {
		return tipoApartamentos;
	}
	
	public TipoApartamento getTipoApartamento() {
		return tipoApartamento;
	}
	
	public void saveTipoApartamento(TipoApartamento tipoApartamento){
		try {
			facade.save(tipoApartamento);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.tipoApartamento = tipoApartamento;
	}
	
	public void removeTipoApartamento(TipoApartamento tipoApartamento){
		try {
			facade.excluir(tipoApartamento);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void registerTipoApartamento(TipoApartamento tipoApartamento){
		try {
			this.tipoApartamento = facade.consultar(tipoApartamento);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void listTipoApartamento(){
		try {
			this.tipoApartamentos = facade.listarTipoApartamento();
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

}
