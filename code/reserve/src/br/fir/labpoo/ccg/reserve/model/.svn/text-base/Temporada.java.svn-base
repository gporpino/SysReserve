package br.fir.labpoo.ccg.reserve.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.joda.time.LocalDate;

@Entity
public class Temporada extends BasicClass {
	@Id
	private int id;
	private String nome;
	private LocalDate inicio;
	private LocalDate fim;
	private double valor; 
	
	public Temporada(){}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
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
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public Temporada clone() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
