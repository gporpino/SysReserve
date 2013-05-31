/**
 *
 */
package br.fir.labpoo.ccg.reserve.business;

import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.factory.RepositoryFactory;
import br.fir.labpoo.ccg.reserve.model.Cidade;


/**
 * @author cristiano
 *
 */
public final class CadastroCidade extends Cadastro<Cidade> {

	public CadastroCidade() throws RepositoryException{
		super(RepositoryFactory.getInstance().getRepositoryCidade());
	}
	
}
