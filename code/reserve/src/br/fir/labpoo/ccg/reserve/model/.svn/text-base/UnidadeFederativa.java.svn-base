package br.fir.labpoo.ccg.reserve.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UnidadeFederativa extends BasicClass {
 
	@Id
	private int id;
	 
	private String descricao;
	 
	public UnidadeFederativa() {
	}

	public UnidadeFederativa(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public UnidadeFederativa clone() {
		UnidadeFederativa uf = new UnidadeFederativa();
		uf.id = this.id;
		if (this.descricao != null){
			uf.descricao = new String(this.descricao);
		}
		
		return uf;
	}
	
	 
}
 
