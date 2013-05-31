/**
 *
 */
package br.fir.labpoo.ccg.reserve.repository.memoria;

import java.util.Date;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import br.fir.labpoo.ccg.reserve.model.Apartamento;
import br.fir.labpoo.ccg.reserve.model.Reserva;

/**
 * @author cristiano
 *
 */
public class RepositorioReservaMemoria extends IRepositoryMemoryImpl<Reserva> {


	/**
	 * @param repositorioReserva
	 */
	public RepositorioReservaMemoria() {
		super( new TreeMap<Integer, Reserva>()); 
	}

	public Set<Apartamento> listApartamentos(Date inicio, Date fim){
		Set<Apartamento> listHospedagem = new TreeSet<Apartamento>();

		for (Reserva reserva : repository.values()) {

			if((reserva.getInicio().compareTo(inicio) >= 0) && (reserva.getFim().compareTo(fim) <= 0)){
				listHospedagem.add(reserva.getApartamento());
			}
		}
		return listHospedagem;
	}

	public double getValor(Reserva reserva){
//		LocalDate inicio = reserva.getInicio();
//		LocalDate fim = reserva.getFim();
//		int qtdDias =  inicio.getDate() - fim.getDate();
//		RepositorioTemporadaMemoria rep = new RepositorioTemporadaMemoria();
//		Temporada temporada = rep.consultar(inicio, fim);
//		Diaria diaria = new Diaria(temporada, reserva.getApartamento());
//	    return  diaria.calculaDiaria() * qtdDias;
		return 0.0;
	}
}
