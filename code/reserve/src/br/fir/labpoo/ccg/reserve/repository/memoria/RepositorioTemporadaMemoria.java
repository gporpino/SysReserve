/**
 *
 */
package br.fir.labpoo.ccg.reserve.repository.memoria;

import java.util.Date;
import java.util.TreeMap;

import br.fir.labpoo.ccg.reserve.exception.TemporadaInexistenteException;
import br.fir.labpoo.ccg.reserve.model.Temporada;

/**
 * @author cristiano
 *
 */
public class RepositorioTemporadaMemoria extends IRepositoryMemoryImpl<Temporada>{

	/**
	 * @param repositorioTemporada
	 */
	public RepositorioTemporadaMemoria() {
		super( new TreeMap<Integer, Temporada>());
	}

	public Temporada consultar(Date inicio, Date fim){
//		for (Temporada temporada : repository.values()) {
//			if((temporada.getDataInicio().compareTo(inicio) >= 0) || (temporada.getDataFim().compareTo(fim) <= 0)){
//				return temporada;
//			}
//		}
		/*
		 * Se não achar uma temporada levanta uma exception
		 */
		throw new TemporadaInexistenteException();
	}

}
