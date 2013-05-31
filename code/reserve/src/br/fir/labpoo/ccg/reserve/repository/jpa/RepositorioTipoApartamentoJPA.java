package br.fir.labpoo.ccg.reserve.repository.jpa;

import br.fir.labpoo.ccg.reserve.exception.EntradaInexistenteException;
import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.model.Apartamento;
import br.fir.labpoo.ccg.reserve.model.TipoApartamento;

public class RepositorioTipoApartamentoJPA extends IRepositoryJPAImpl<TipoApartamento> {

	public RepositorioTipoApartamentoJPA() throws RepositoryException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void alterarTipoApartamento(TipoApartamento tipo)
			throws EntradaInexistenteException {
		// TODO Auto-generated method stub

	}

	public Apartamento consultarTipoApartamento(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	public void excluirTipoApartamento(TipoApartamento tipo)
			throws EntradaInexistenteException {
		// TODO Auto-generated method stub

	}

	public void inserirTipoApartamento(TipoApartamento tipo) {
		// TODO Auto-generated method stub

	}

}
