/**
 * 
 */
package br.fir.labpoo.ccg.reserve.repository.jpa;

import br.fir.labpoo.ccg.reserve.exception.EntradaInexistenteException;
import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.model.Telefone;

/**
 * @author cristiano
 *
 */
public class RepositorioTelefoneJPA extends IRepositoryJPAImpl<Telefone> {

	public RepositorioTelefoneJPA() throws RepositoryException {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see repositorio.telefone.telefone.IntRepositorioTelefone#alterarTelefone(negocio.telefone.telefone.Telefone)
	 */
	public void alterarTelefone(Telefone telefone)
			throws EntradaInexistenteException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see repositorio.telefone.telefone.IntRepositorioTelefone#consultarTelefoneCodigo(int)
	 */
	public Telefone consultarTelefoneCodigo(int codigoTelefone) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see repositorio.telefone.telefone.IntRepositorioTelefone#excluirTelefone(negocio.telefone.telefone.Telefone)
	 */
	public void excluirTelefone(Telefone telefone)
			throws EntradaInexistenteException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see repositorio.telefone.telefone.IntRepositorioTelefone#inserirTelefone(negocio.telefone.telefone.Telefone)
	 */
	public void inserirTelefone(Telefone telefone) {
		// TODO Auto-generated method stub

	}

}
