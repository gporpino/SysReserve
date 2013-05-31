package br.fir.labpoo.ccg.reserve.controller;

import java.util.Collection;

import org.vraptor.annotations.Component;

import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.facade.Facade;
import br.fir.labpoo.ccg.reserve.model.Hospede;

@Component
public class HospedeAction {
	
	private Collection<Hospede> hospedes;
	private Hospede hospede;
	private Facade facade;
	
	public HospedeAction(){
		this.facade = Facade.getInstacia();
	}
	
	public Collection<Hospede> getHospedes() {
		return hospedes;
	}
	
	public Hospede getHospede() {
		return hospede;
	}
	
	public void saveHospede(Hospede hospede){
		try {
			facade.save(hospede);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void removeHospede(Hospede hospede){
		try {
			facade.excluir(hospede);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void registerHospede(Hospede hospede){
		try {
			this.hospede = facade.consultar(hospede);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void listHospede(){
		try {
			this.hospedes = facade.listarHospede();
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	


}
