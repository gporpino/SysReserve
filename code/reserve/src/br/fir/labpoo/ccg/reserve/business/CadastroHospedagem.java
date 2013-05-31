/**
 *
 */
package br.fir.labpoo.ccg.reserve.business;

import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.factory.RepositoryFactory;
import br.fir.labpoo.ccg.reserve.model.Hospedagem;

/**
 * @author cristiano
 *
 */
public class CadastroHospedagem extends Cadastro<Hospedagem> {

	public CadastroHospedagem() throws RepositoryException{
		super(RepositoryFactory.getInstance().getRepositoryHospedagem());
	}
}
