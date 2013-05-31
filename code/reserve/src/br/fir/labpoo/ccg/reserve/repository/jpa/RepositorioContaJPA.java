/**
 *
 */
package br.fir.labpoo.ccg.reserve.repository.jpa;

import br.fir.labpoo.ccg.reserve.exception.EntradaInexistenteException;
import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.model.Conta;
import br.fir.labpoo.ccg.reserve.model.Temporada;

/**
 * @author cristiano
 *
 */
public class RepositorioContaJPA extends IRepositoryJPAImpl<Conta> {

	public RepositorioContaJPA() throws RepositoryException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void alterarConta(Conta conta) throws EntradaInexistenteException {
		// TODO Auto-generated method stub

	}

	public Conta consultarContaCodigo(int codigoConta) {
		// TODO Auto-generated method stub
		return null;
	}

	public void excluirConta(Conta conta) throws EntradaInexistenteException {
		// TODO Auto-generated method stub

	}

	public double getValorConta(Conta conta, Temporada temporada) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void inserirConta(Conta conta) {
		// TODO Auto-generated method stub

	}


}
