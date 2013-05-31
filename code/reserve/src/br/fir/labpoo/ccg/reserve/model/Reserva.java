package br.fir.labpoo.ccg.reserve.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.joda.time.LocalDate;

@Entity
public class Reserva extends BasicClass {
	
	@Id
	private int id;
	private LocalDate inicio;
	private LocalDate fim;
	private Apartamento apartamento;
	private Hospede hospede;
	
	public Reserva(){}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public LocalDate getInicio() {
		return inicio;
	}
	
	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}
	
	public LocalDate getFim() {
		return fim;
	}
	
	public void setFim(LocalDate fim) {
		this.fim = fim;
	}
	
	public Apartamento getApartamento() {
		return apartamento;
	}
	
	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}
	
	public Hospede getHospede() {
		return hospede;
	}
	
	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	@Override
	public BasicClass clone() {
		//TODO fazer o método
		return null;
	}

}
