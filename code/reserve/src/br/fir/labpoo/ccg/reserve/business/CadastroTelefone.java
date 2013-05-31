/**
 *
 */
package br.fir.labpoo.ccg.reserve.business;

import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.factory.RepositoryFactory;
import br.fir.labpoo.ccg.reserve.model.Telefone;

/**
 * @author cristiano
 *
 */
public class CadastroTelefone extends Cadastro<Telefone> {

	public CadastroTelefone() throws RepositoryException{
		super(RepositoryFactory.getInstance().getRepositoryTelefone());
	}
}
