package br.fir.labpoo.ccg.reserve.controller;

import java.util.Collection;

import org.vraptor.annotations.Component;

import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.facade.Facade;
import br.fir.labpoo.ccg.reserve.model.Temporada;

@Component
public class TemporadaAction {
	private Collection<Temporada> temporadas;
	private Temporada temporada;
	private Facade facade;
	
	public TemporadaAction(){
		this.facade = Facade.getInstacia();
	}
	
	public Collection<Temporada> getTemporadas() {
		return temporadas;
	}
	
	public Temporada getTemporada() {
		return temporada;
	}
	
	public void saveTemporada(Temporada temporada){
		try {
			facade.save(temporada);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void removeTemporada(Temporada temporada){
		try {
			facade.excluir(temporada);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void registerTemporada(Temporada temporada){
		try {
			this.temporada = facade.consultar(temporada);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void listTemporada(){
		try {
			this.temporadas = facade.listarTemporada();
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

}
