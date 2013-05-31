package br.fir.labpoo.ccg.reserve.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.joda.time.LocalDate;

@Entity
public class Hospedagem extends BasicClass {
	@Id
	private int id;
	private LocalDate inicio;
	private LocalDate fim;
	private Apartamento apartamento;
	private Hospede hospede;

	/**
	 *
	 */
	public Hospedagem() {
	}

	/**
	 * @param id
	 */
	public Hospedagem(int id) {
		this.id = id;
	}

	/**
	 * @param inicio
	 * @param fim
	 * @param apartamento
	 * @param hospede
	 */
	public Hospedagem(int id, LocalDate inicio, LocalDate fim, Apartamento apartamento,
			Hospede hospede) {
		this.id = id;
		this.inicio = inicio;
		this.fim = fim;
		this.apartamento = apartamento;
		this.hospede = hospede;
	}


	/**
	 * @param reserva
	 */
	public Hospedagem(Reserva reserva) {
		this.apartamento = reserva.getApartamento();
		this.inicio = reserva.getInicio();
		this.fim = reserva.getFim();
		this.hospede = reserva.getHospede();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the inicio
	 */
	public LocalDate getInicio() {
		return inicio;
	}

	/**
	 * @param inicio the abertura to set
	 */
	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}

	/**
	 * @return the fim
	 */
	public LocalDate getFim() {
		return fim;
	}

	/**
	 * @param fim the fim to set
	 */
	public void setFim(LocalDate fim) {
		this.fim = fim;
	}

	/**
	 * @return the apartamento
	 */
	public Apartamento getApartamento() {
		return apartamento;
	}

	/**
	 * @param apartamento the apartamento to set
	 */
	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}

	/**
	 * @return the hospede
	 */
	public Hospede getHospede() {
		return hospede;
	}

	/**
	 * @param hospede the hospede to set
	 */
	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	@Override
	public Hospedagem clone() {
		Hospedagem hospedagem = new Hospedagem();
		hospedagem.id = this.id;
		if (this.inicio != null){
			hospedagem.inicio = new LocalDate(this.inicio);
		}
		if (this.fim != null){
			hospedagem.fim = new LocalDate(this.fim);
		}
		if (this.apartamento != null){
			hospedagem.apartamento = this.apartamento.clone();
		}
		
		if (this.hospede != null){
			hospedagem.hospede = this.hospede.clone();
		}
		return hospedagem;
	}


}
