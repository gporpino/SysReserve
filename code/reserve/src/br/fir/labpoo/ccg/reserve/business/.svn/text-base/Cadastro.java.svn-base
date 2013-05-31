package br.fir.labpoo.ccg.reserve.business;

import java.util.Collection;

import br.fir.labpoo.ccg.reserve.exception.EntradaInexistenteException;
import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.model.BasicClass;
import br.fir.labpoo.ccg.reserve.repository.IRepository;

/**
 * @author cristiano
 *
 */
public abstract class Cadastro<Type extends BasicClass> {
	protected IRepository<Type> repository;
	
	public Cadastro(IRepository<Type> repository) {
		this.repository = repository;		
	}
	
	public void inserir(Type type) throws RepositoryException {

		repository.inserir(type);		
	}
	
	public void alterar(Type type) throws EntradaInexistenteException, RepositoryException {
		repository.alterar(type);
		
	}
	
	public void excluir(Type type) throws EntradaInexistenteException, RepositoryException {
		repository.excluir(type);
	}

	public Type consultar(Type type) throws RepositoryException {
		return repository.consultar(type);
	}
	
	public Collection<Type> listar() throws EntradaInexistenteException, RepositoryException {
		return repository.listar();
	}
}
