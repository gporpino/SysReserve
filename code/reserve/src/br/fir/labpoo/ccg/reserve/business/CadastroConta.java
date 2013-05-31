/**
 *
 */
package br.fir.labpoo.ccg.reserve.business;
import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.factory.RepositoryFactory;
import br.fir.labpoo.ccg.reserve.model.Conta;
import br.fir.labpoo.ccg.reserve.model.Temporada;
import br.fir.labpoo.ccg.reserve.repository.memoria.RepositorioContaMemoria;

/**
 * @author clelia
 *
 */
public class CadastroConta extends Cadastro<Conta> {
	

    public CadastroConta() throws RepositoryException{
		super(RepositoryFactory.getInstance().getRepositoryConta());
	}

	public double getValorConta(Conta conta, Temporada temporada) {
		
		RepositorioContaMemoria repository = (RepositorioContaMemoria)this.repository;
		
		return repository.getValorConta(conta, temporada);
	}

}
