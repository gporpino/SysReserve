package br.fir.labpoo.ccg.reserve.model;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
@DiscriminatorColumn(name="tipo")
public abstract class Pessoa extends BasicClass {
 
	@Id
	protected int id;
	 
	protected String nome;
	 
	protected String cpf;
	 
	protected String sexo;
	
	protected Date dataNascimento;
	 
	protected Endereco endereco;
	 
	protected ArrayList <Telefone> telefones;

	public Pessoa() {
	}

	public Pessoa(int id, String nome, String cpf, String sexo,
			Date dataNascimento, Endereco endereco, ArrayList<Telefone> telefones) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.endereco = endereco;
		this.telefones = telefones;
		this.dataNascimento = dataNascimento;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(ArrayList<Telefone> telefones) {
		this.telefones = telefones;
	}
	
}
 
