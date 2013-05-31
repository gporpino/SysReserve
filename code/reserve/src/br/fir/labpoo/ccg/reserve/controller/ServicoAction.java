package br.fir.labpoo.ccg.reserve.controller;

import java.util.Collection;

import org.vraptor.annotations.Component;

import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.facade.Facade;
import br.fir.labpoo.ccg.reserve.model.Servico;

@Component
public class ServicoAction {
	private Collection<Servico> servicos;
	private Servico servico;
	private Facade facade;
	
	public ServicoAction(){
		this.facade = Facade.getInstacia();
	}
	
	public Collection<Servico> getServicos() {
		return servicos;
	}
	
	public Servico getServico() {
		return servico;
	}
	
	public void saveServico(Servico servico){
		try {
			facade.save(servico);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void removeServico(Servico servico){
		try {
			facade.excluir(servico);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void registerServico(Servico servico){
		try {
			this.servico = facade.consultar(servico);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void listServico(){
		try {
			this.servicos = facade.listarServico();
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

}
