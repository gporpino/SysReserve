package br.fir.labpoo.ccg.reserve.repository.jpa;

import br.fir.labpoo.ccg.reserve.exception.EntradaInexistenteException;
import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.model.Apartamento;

public class RepositorioApartamentoJPA extends IRepositoryJPAImpl<Apartamento> {

	public RepositorioApartamentoJPA() throws RepositoryException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void alterarApartamento(Apartamento apartamento)
			throws EntradaInexistenteException {
		// TODO Auto-generated method stub

	}

	public Apartamento consultarApartamento(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	public void excluirApartamento(Apartamento apartamento)
			throws EntradaInexistenteException {
		// TODO Auto-generated method stub

	}

	public void inserirApartamento(Apartamento apartamento) {
		// TODO Auto-generated method stub

	}

}
