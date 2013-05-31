/**
 *
 */
package br.fir.labpoo.ccg.reserve.repository.memoria;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import br.fir.labpoo.ccg.reserve.exception.EntradaInexistenteException;
import br.fir.labpoo.ccg.reserve.model.BasicClass;
import br.fir.labpoo.ccg.reserve.repository.IRepository;

/**
 * @author gporpino
 *
 */
public abstract class IRepositoryMemoryImpl<Type extends BasicClass> implements IRepository<Type> {
	protected Map<Integer, Type> repository;
	
	
	protected IRepositoryMemoryImpl(Map<Integer, Type> map){
		this.repository = map;
	}

	@Override
	public void inserir(Type type) {
		repository.put(type.getId(), type);
	}

	@Override
	public void alterar(Type type) throws EntradaInexistenteException {
		if(consultar(type) == null) {
			throw new EntradaInexistenteException("O objeto "+ type.getClass().getSimpleName()
					+" com id "+ type.getId() 
					+" não pode ser alterado pois não foi encontrado.");
		}else{
			repository.put(type.getId(), type);
		}
	}

	@Override
	public void excluir(Type type) throws EntradaInexistenteException {
		if(consultar(type) != null) {
			repository.remove(type.getId());
		} else {
			throw new EntradaInexistenteException("O objeto" + type.getClass().getSimpleName() + " não pode ser excluído pois não foi encontrado.");
		}
	}
	
	@Override
	public Type consultar(Type type) {
		if(repository.containsKey(type.getId())) {
			return (Type)repository.get(type.getId()).clone();
		}
		return null;
	}

	@Override
	public Collection<Type> listar() {
		ArrayList<Type> list = new ArrayList<Type>();
		for (Type type : repository.values()) {
			list.add((Type)type.clone());
		}
		return list;
	}

}
