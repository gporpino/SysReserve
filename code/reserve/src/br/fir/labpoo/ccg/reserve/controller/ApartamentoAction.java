package br.fir.labpoo.ccg.reserve.controller;

import java.util.Collection;

import org.vraptor.annotations.Component;

import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.facade.Facade;
import br.fir.labpoo.ccg.reserve.model.Apartamento;
import br.fir.labpoo.ccg.reserve.model.TipoApartamento;

@Component
public class ApartamentoAction {
	private Collection<Apartamento> apartamentos;
	private Apartamento apartamento;
	private Facade facade;
	
	public ApartamentoAction(){
		this.facade = Facade.getInstacia();
	}
	
	public Collection<Apartamento> getApartamentos() {
		return this.apartamentos;
	}
	
	public Apartamento getApartamento(){
		return this.apartamento;
	}
	
	public void saveApartamento(Apartamento apartamento){
		try {
			facade.save(apartamento);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void removeApartamento(Apartamento apartamento){
		try {
			facade.excluir(apartamento);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void registerApartamento(Apartamento apartamento){
		try {
			this.apartamento = facade.consultar(apartamento);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void listApartamento(){
		try {
			this.apartamentos = facade.listarApartamento();
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	public Collection<TipoApartamento> getListaTipo(){
		try {
			return facade.listarTipoApartamento();
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
