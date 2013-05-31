/**
 * 
 */
package br.fir.labpoo.ccg.reserve.repository.jpa;

import br.fir.labpoo.ccg.reserve.exception.EntradaInexistenteException;
import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.model.Pessoa;

/**
 * @author cristiano
 *
 */
public class RepositorioPessoaJPA extends IRepositoryJPAImpl<Pessoa> {

	public RepositorioPessoaJPA() throws RepositoryException {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see repositorio.envolvidos.pessoa.IntRepositorioPessoa#alterarPessoa(negocio.envolvidos.pessoa.Pessoa)
	 */
	public void alterarPessoa(Pessoa pessoa) throws EntradaInexistenteException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see repositorio.envolvidos.pessoa.IntRepositorioPessoa#consultarPessoaCodigo(int)
	 */
	public Pessoa consultarPessoaCodigo(int codigoPessoa) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see repositorio.envolvidos.pessoa.IntRepositorioPessoa#excluirPessoa(negocio.envolvidos.pessoa.Pessoa)
	 */
	public void excluirPessoa(Pessoa pessoa) throws EntradaInexistenteException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see repositorio.envolvidos.pessoa.IntRepositorioPessoa#inserirPessoa(negocio.envolvidos.pessoa.Pessoa)
	 */
	public void inserirPessoa(Pessoa pessoa) {
		// TODO Auto-generated method stub

	}

}
