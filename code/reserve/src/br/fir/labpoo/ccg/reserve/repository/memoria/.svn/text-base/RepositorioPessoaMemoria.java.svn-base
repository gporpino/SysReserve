/**
 *
 */
package br.fir.labpoo.ccg.reserve.repository.memoria;

import java.util.TreeMap;

import br.fir.labpoo.ccg.reserve.model.Funcionario;
import br.fir.labpoo.ccg.reserve.model.Hospede;
import br.fir.labpoo.ccg.reserve.model.Pessoa;

/**
 * @author cristiano
 *
 */
public class RepositorioPessoaMemoria extends IRepositoryMemoryImpl<Pessoa> {

	/**
	 * @param repositorioPessoa
	 */
	public RepositorioPessoaMemoria() {
		super( new TreeMap<Integer, Pessoa>());
	}
	
	public Funcionario consultar(Funcionario type) {
		Pessoa pessoa = super.consultar(type);
		if (pessoa instanceof Funcionario){
			return (Funcionario)pessoa;
		}
		return null;
	}
	
	public Hospede consultar(Hospede type) {
		Pessoa pessoa = super.consultar(type);
		if (pessoa instanceof Hospede){
			return (Hospede)pessoa;
		}
		return null;
	}
}
