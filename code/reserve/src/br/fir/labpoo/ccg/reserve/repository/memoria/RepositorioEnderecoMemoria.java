/**
 *
 */
package br.fir.labpoo.ccg.reserve.repository.memoria;

import java.util.TreeMap;

import br.fir.labpoo.ccg.reserve.model.Endereco;

/**
 * @author cristiano
 *
 */
public class RepositorioEnderecoMemoria extends IRepositoryMemoryImpl<Endereco> {

	/**
	 * @param repositorioEndereco
	 */
	public RepositorioEnderecoMemoria() {
		super( new TreeMap<Integer, Endereco>() );
	}
	
}
