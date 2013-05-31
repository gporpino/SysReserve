/**
 *
 */
package br.fir.labpoo.ccg.reserve.business;

import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.factory.RepositoryFactory;
import br.fir.labpoo.ccg.reserve.model.Servico;

/**
 * @author cristiano
 *
 */
public class CadastroServico extends Cadastro<Servico> {

	public CadastroServico() throws RepositoryException{
		super(RepositoryFactory.getInstance().getRepositoryServico());
	}
}
