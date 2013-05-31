package br.fir.labpoo.ccg.reserve.repository;

import java.util.Collection;

import br.fir.labpoo.ccg.reserve.exception.EntradaInexistenteException;
import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.model.BasicClass;

public interface IRepository <Type extends BasicClass> {
	public void inserir(Type type) throws RepositoryException;

	public void alterar(Type type ) throws EntradaInexistenteException, RepositoryException;

	public void excluir(Type type) throws EntradaInexistenteException, RepositoryException;

	public Type consultar(Type type) throws RepositoryException;

	public Collection<Type> listar() throws RepositoryException;
}
