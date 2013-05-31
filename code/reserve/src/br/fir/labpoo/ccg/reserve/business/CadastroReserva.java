/**
 *
 */
package br.fir.labpoo.ccg.reserve.business;

import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.factory.RepositoryFactory;
import br.fir.labpoo.ccg.reserve.model.Reserva;

/**
 * @author cristiano
 *
 */
public class CadastroReserva extends Cadastro<Reserva> {

	public CadastroReserva() throws RepositoryException{
		super(RepositoryFactory.getInstance().getRepositoryReserva());
	}
}
