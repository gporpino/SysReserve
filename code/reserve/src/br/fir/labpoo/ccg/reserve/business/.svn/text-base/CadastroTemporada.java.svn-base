/**
 *
 */
package br.fir.labpoo.ccg.reserve.business;

import java.util.Date;

import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.factory.RepositoryFactory;
import br.fir.labpoo.ccg.reserve.model.Temporada;
import br.fir.labpoo.ccg.reserve.repository.memoria.RepositorioTemporadaMemoria;

/**
 * @author cristiano
 *
 */
public class CadastroTemporada extends Cadastro<Temporada> {

	public CadastroTemporada() throws RepositoryException{
		super(RepositoryFactory.getInstance().getRepositoryTemporada());
	}
	
	public Temporada consultar(Date inicio, Date fim) {
		
		RepositorioTemporadaMemoria repositorio = (RepositorioTemporadaMemoria) repository;
		
		return repositorio.consultar(inicio, fim);
	}
}
