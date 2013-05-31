package br.fir.labpoo.ccg.reserve.model;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="1")
public class Hospede extends Pessoa {
	
	private String email;
	private int numeroCartaoFidelidade;
	
	public Hospede() {
		super();
	}

	public Hospede(int id, String nome, String cpf, String sexo,
			Date dataNascimento, Endereco endereco, ArrayList<Telefone> telefones, 
			String email, int numeroCartaoFidelidade) {
		super(id, nome, cpf, sexo, dataNascimento, endereco, telefones);
		this.email = email;
		this.numeroCartaoFidelidade = numeroCartaoFidelidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumeroCartaoFidelidade() {
		return numeroCartaoFidelidade;
	}

	public void setNumeroCartaoFidelidade(int numeroCartaoFidelidade) {
		this.numeroCartaoFidelidade = numeroCartaoFidelidade;
	}

	@Override
	public Hospede clone() {
		
		Hospede hospede = new Hospede();
		
		hospede.id = this.id;
		
		if (this.nome != null){
			hospede.nome = new String(this.nome);
		}
		
		if (this.cpf != null){
			hospede.cpf = new String(this.cpf);
		}
		 
		if (this.sexo != null){
			hospede.sexo = new String(this.sexo);
		}
		 
		if (this.dataNascimento != null){
			hospede.dataNascimento = new Date(this.dataNascimento.getTime());
		}
		
		if (this.endereco != null){
			hospede.endereco = this.endereco.clone();
		}
		
		if (this.telefones != null){
			hospede.telefones = new ArrayList<Telefone>();
			for (Telefone telefone : this.telefones) {
				hospede.telefones.add(telefone.clone());
			}
		}
		 
		hospede.numeroCartaoFidelidade = this.numeroCartaoFidelidade;
		
		if (this.email != null){
			hospede.email = new String(this.email);
		}
		
		return hospede;
	}

}
