/**
 *
 */
package br.fir.labpoo.ccg.reserve.business;

import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.factory.RepositoryFactory;
import br.fir.labpoo.ccg.reserve.model.Endereco;

/**
 * @author cristiano
 *
 */
public class CadastroEndereco extends Cadastro<Endereco> {

	public CadastroEndereco() throws RepositoryException{
		super(RepositoryFactory.getInstance().getRepositoryEndereco());
	}
}
