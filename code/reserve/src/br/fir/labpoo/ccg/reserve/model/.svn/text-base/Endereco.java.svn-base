package br.fir.labpoo.ccg.reserve.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Endereco extends BasicClass {

	@Id
	private int id;

	private String logradouro;

	private String numero;

	private String bairro;

	private String complemento;

	private String cep;

	private Cidade cidade;

	public Endereco() {
	}

	public Endereco(int idEndereco, String logradouro,
			String numero, String bairro, String complemento, String cep,
			Cidade cidade) {
		this.id = idEndereco;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cep = cep;
		this.cidade = cidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	@Override
	public Endereco clone() {
		Endereco endereco = new Endereco();
		
		endereco.id = this.id;

		if (this.logradouro != null){
			endereco.logradouro = new String(this.logradouro);
		}

		if(this.numero != null){
			endereco.numero = new String(this.numero);
		}

		if(this.bairro != null){
			endereco.bairro = new String(this.bairro);
		}
		
		if(this.complemento != null){
			endereco.complemento = new String(this.complemento);
		}

		if(this.cep != null){
			endereco.cep = new String(this.cep);
		}

		if(this.cidade != null){
			endereco.cidade = this.cidade.clone();
		}
		
		return null;
	}

}

