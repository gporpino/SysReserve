/**
 *
 */
package br.fir.labpoo.ccg.reserve.model;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * @author clelia
 *
 */
@Entity
public class Diaria extends BasicClass {
	
	@Id
	private Temporada temporada;
	private Apartamento apartamento;

	public Diaria (){
		
	}
	
	/**
	 * @param temporada
	 * @param apartamento
	 */
	public Diaria(Temporada temporada, Apartamento apartamento) {
		this.temporada = temporada;
		this.apartamento = apartamento;
	}

	public double calculaDiaria() {
		double taxa  =  apartamento.getTaxa() / 100;
	    double valor =  temporada.getValor();
	    return ( taxa * valor) + valor;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BasicClass clone() {
		Diaria diaria = new Diaria();
		
		if (this.apartamento != null){
			diaria.apartamento = this.apartamento.clone();
		}
		
		if (this.temporada != null){
			diaria.temporada = this.temporada.clone();
		}
		
		return null;
	}
	
}
