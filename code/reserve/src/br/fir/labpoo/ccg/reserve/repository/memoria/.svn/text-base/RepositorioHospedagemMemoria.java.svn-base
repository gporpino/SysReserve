/**
 *
 */
package br.fir.labpoo.ccg.reserve.repository.memoria;

import java.util.Date;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import br.fir.labpoo.ccg.reserve.model.Apartamento;
import br.fir.labpoo.ccg.reserve.model.Hospedagem;

/**
 * @author cristiano
 *
 */
public class RepositorioHospedagemMemoria extends IRepositoryMemoryImpl<Hospedagem> {

	/**
	 * @param repositorioHospedagem
	 */
	public RepositorioHospedagemMemoria() {
		super( new TreeMap<Integer, Hospedagem>() );
	}

	public Set<Apartamento> listarApartamentos(Date inicio, Date fim){
		Set<Apartamento> listHospedagem = new TreeSet<Apartamento>();

		for (Hospedagem hospedagem : repository.values()) {

			if((hospedagem.getInicio().compareTo(inicio) >= 0) && (hospedagem.getFim().compareTo(fim) <= 0)){
				listHospedagem.add(hospedagem.getApartamento());
			}
		}
		return listHospedagem;
	}
}
