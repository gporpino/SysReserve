package br.fir.labpoo.ccg.reserve.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Servico extends BasicClass {
	
	@Id
	private int id;
	private int quantidade;
	private double valor;
	
	public Servico()  {
	}
	
	public Servico(int id, int quantidade, double valor) {
		this.id = id;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public Servico clone() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
