/**
 *
 */
package br.fir.labpoo.ccg.reserve.repository.memoria;

import java.util.TreeMap;

import br.fir.labpoo.ccg.reserve.model.Apartamento;

/**
 * @author clelia
 *
 */
public class RepositorioApartamentoMemoria extends IRepositoryMemoryImpl<Apartamento> {

	public RepositorioApartamentoMemoria() {
		super( new TreeMap<Integer, Apartamento>() );
	}
}
