/**
 *
 */
package br.fir.labpoo.ccg.reserve.repository.memoria;

import java.util.List;
import java.util.TreeMap;

import br.fir.labpoo.ccg.reserve.model.Apartamento;
import br.fir.labpoo.ccg.reserve.model.Conta;
import br.fir.labpoo.ccg.reserve.model.Diaria;
import br.fir.labpoo.ccg.reserve.model.Servico;
import br.fir.labpoo.ccg.reserve.model.Temporada;

/**
 * @author cristiano
 *
 */
public class RepositorioContaMemoria extends IRepositoryMemoryImpl<Conta> {

	/**
	 * @param repositorioConta
	 */
	public RepositorioContaMemoria() {
		super( new TreeMap<Integer, Conta>() );
	}

	public double getValorConta(Conta conta, Temporada temporada) {
		Apartamento apartamento = conta.getHospedagem().getApartamento();
		Diaria daria = new Diaria(temporada, apartamento);
		return getValorServico(conta.getServicos()) + daria.calculaDiaria();
	}

	private double getValorServico(List<Servico> servicos){
		double valor = 0;
		for (Servico servico : servicos) {
			valor += servico.getValor() * servico.getQuantidade();
		}
		return valor;
	}

}
