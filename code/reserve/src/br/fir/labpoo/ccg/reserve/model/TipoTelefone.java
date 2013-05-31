package br.fir.labpoo.ccg.reserve.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoTelefone extends BasicClass {
 
	@Id
	private int id;
	 
	private String descricao;
	 
	public TipoTelefone() {
	}
	
	public TipoTelefone(int id, String descricao) {
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
	public TipoTelefone clone() {
		TipoTelefone tipoTelefone = new TipoTelefone();
		
		tipoTelefone.id = id;
		
		if (this.descricao != null){ 
			tipoTelefone.descricao = new String(this.descricao); 
		}
		
		return tipoTelefone;
	}
	 
}
 
