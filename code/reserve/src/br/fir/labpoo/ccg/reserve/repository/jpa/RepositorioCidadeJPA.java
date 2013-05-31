/**
 * 
 */
package br.fir.labpoo.ccg.reserve.repository.jpa;

import java.util.List;

import br.fir.labpoo.ccg.reserve.exception.EntradaInexistenteException;
import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.model.Cidade;

/**
 * @author cristiano
 *
 */
public class RepositorioCidadeJPA extends IRepositoryJPAImpl<Cidade> {

	public RepositorioCidadeJPA() throws RepositoryException {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see repositorio.cidade.IntRepositorioCidade#alterarCidade(negocio.cidade.Cidade)
	 */
	public void alterarCidade(Cidade cidade) throws EntradaInexistenteException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see repositorio.cidade.IntRepositorioCidade#excluirCidade(negocio.cidade.Cidade)
	 */
	public void excluirCidade(Cidade cidade) throws EntradaInexistenteException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see repositorio.cidade.IntRepositorioCidade#inserirCidade(negocio.cidade.Cidade)
	 */
	public void inserirCidade(Cidade cidade) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see repositorio.cidade.IntRepositorioCidade#listarCidades()
	 */
	public List<Cidade> listarCidades() throws EntradaInexistenteException {
		// TODO Auto-generated method stub
		return null;
	}

}
