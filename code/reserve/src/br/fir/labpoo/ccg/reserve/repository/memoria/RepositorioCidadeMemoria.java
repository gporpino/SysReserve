/**
 *
 */
package br.fir.labpoo.ccg.reserve.repository.memoria;

import java.util.TreeMap;

import br.fir.labpoo.ccg.reserve.model.Cidade;

/**
 * @author cristiano
 *
 */
public class RepositorioCidadeMemoria extends IRepositoryMemoryImpl<Cidade> {

	public RepositorioCidadeMemoria() {
		super( new TreeMap<Integer, Cidade>() );
	}
}
