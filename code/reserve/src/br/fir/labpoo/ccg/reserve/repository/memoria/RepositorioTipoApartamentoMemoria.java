/**
 *
 */
package br.fir.labpoo.ccg.reserve.repository.memoria;

import java.util.TreeMap;

import br.fir.labpoo.ccg.reserve.model.TipoApartamento;

/**
 * @author clelia
 *
 */
public class RepositorioTipoApartamentoMemoria extends IRepositoryMemoryImpl<TipoApartamento> {

	public RepositorioTipoApartamentoMemoria() {
		super( new TreeMap<Integer, TipoApartamento>() );
	}
}
