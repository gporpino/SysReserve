/**
 * 
 */
package br.fir.labpoo.ccg.reserve.repository.jpa;

import br.fir.labpoo.ccg.reserve.exception.EntradaInexistenteException;
import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.model.Servico;

/**
 * @author cristiano
 *
 */
public class RepositorioServicoJPA extends IRepositoryJPAImpl<Servico> {

	public RepositorioServicoJPA() throws RepositoryException {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see repositorio.servico.IntRepositorioServico#alterarServico(negocio.servico.Servico)
	 */
	public void alterarServico(Servico servico)
			throws EntradaInexistenteException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see repositorio.servico.IntRepositorioServico#consultarServicoCodigo(int)
	 */
	public Servico consultarServicoCodigo(int codigoServico) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see repositorio.servico.IntRepositorioServico#excluirServico(negocio.servico.Servico)
	 */
	public void excluirServico(Servico servico)
			throws EntradaInexistenteException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see repositorio.servico.IntRepositorioServico#inserirServico(negocio.servico.Servico)
	 */
	public void inserirServico(Servico servico) {
		// TODO Auto-generated method stub

	}

}
