package br.fir.labpoo.ccg.reserve.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoApartamento extends BasicClass {
	
	@Id
	private int id;
	private String nome;
	private int qtdCamas;
	private double taxa;
	
	public TipoApartamento(){}
	
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
	
	public double getTaxa() {
		return taxa;
	}
	
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public int getQtdCamas() {
		return qtdCamas;
	}

	public void setQtdCamas(int qtdCamas) {
		this.qtdCamas = qtdCamas;
	}

	@Override
	public BasicClass clone() {
		TipoApartamento tipo = new TipoApartamento();
		tipo.id = this.id;
		if(this.nome != null){
			tipo.nome = new String(this.nome);
		}
		tipo.qtdCamas = this.qtdCamas;
		tipo.taxa = this.taxa;
		
		return tipo;
	}
}
