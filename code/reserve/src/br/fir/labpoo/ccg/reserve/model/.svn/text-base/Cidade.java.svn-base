package br.fir.labpoo.ccg.reserve.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cidade extends BasicClass {

	@Id
	private int id;

	private String nome;

	@OneToOne
	private UnidadeFederativa uf;

	public Cidade() {
	}

	public Cidade(int id, String nome, UnidadeFederativa uf) {
		this.id = id;
		this.nome = nome;
		this.uf = uf;
	}

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

	public UnidadeFederativa getUf() {
		return uf;
	}

	public void setUf(UnidadeFederativa uf) {
		this.uf = uf;
	}

	@Override
	public Cidade clone() {

		Cidade cidade = new Cidade();
		cidade.id = this.id;
		if (this.nome != null) {
			cidade.nome = new String(this.nome);
		}
		if (this.uf != null) {
			cidade.uf = this.uf.clone();
		}

		return cidade;
	}

}
