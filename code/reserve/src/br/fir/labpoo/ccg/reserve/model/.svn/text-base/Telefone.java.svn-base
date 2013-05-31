package br.fir.labpoo.ccg.reserve.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Telefone extends BasicClass {
 
	@Id
	private int id;
	 
	private int ddd;
	 
	private int numero;
	 
	private TipoTelefone tipoTelefone;
	 
	public Telefone() {
	}

	public Telefone(int id, int ddd, int numero, TipoTelefone tipoTelefone) {
		this.id = id;
		this.ddd = ddd;
		this.numero = numero;
		this.tipoTelefone = tipoTelefone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	@Override
	public Telefone clone() {
		
		Telefone telefone = new Telefone();
		
		telefone.id = this.id;
		
		telefone.ddd = this.ddd;
		 
		telefone.numero = this.numero;
		 
		if (this.tipoTelefone != null){
			telefone.tipoTelefone = this.tipoTelefone.clone();
		}
		return telefone;
	}
}
 
