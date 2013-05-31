/**
 * 
 */
package br.fir.labpoo.ccg.reserve.repository.jpa;

import br.fir.labpoo.ccg.reserve.exception.EntradaInexistenteException;
import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.model.TipoTelefone;

/**
 * @author cristiano
 *
 */
public class RepositorioTipoTelefoneJPA extends IRepositoryJPAImpl<TipoTelefone> {

	public RepositorioTipoTelefoneJPA() throws RepositoryException {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see repositorio.telefone.tipoTelefone.IntRepositorioTipoTelefone#alterarTipoTelefone(negocio.telefone.tipoTelefone.TipoTelefone)
	 */
	public void alterarTipoTelefone(TipoTelefone tipoTipoTelefone)
			throws EntradaInexistenteException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see repositorio.telefone.tipoTelefone.IntRepositorioTipoTelefone#consultarTipoTelefoneCodigo(int)
	 */
	public TipoTelefone consultarTipoTelefoneCodigo(int codigoTipoTelefone) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see repositorio.telefone.tipoTelefone.IntRepositorioTipoTelefone#excluirTipoTelefone(negocio.telefone.tipoTelefone.TipoTelefone)
	 */
	public void excluirTipoTelefone(TipoTelefone tipoTipoTelefone)
			throws EntradaInexistenteException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see repositorio.telefone.tipoTelefone.IntRepositorioTipoTelefone#inserirTipoTelefone(negocio.telefone.tipoTelefone.TipoTelefone)
	 */
	public void inserirTipoTelefone(TipoTelefone tipoTipoTelefone) {
		// TODO Auto-generated method stub

	}

}
