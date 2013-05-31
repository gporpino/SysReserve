package br.fir.labpoo.ccg.reserve.model;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="2")
public class Funcionario extends Pessoa {
	
	private String matricula;
	private Date dataContratacao;
	
	public Funcionario() {
		super();
	}

	public Funcionario(int id, String nome, String cpf, String sexo,
			Date dataNascimento, Endereco endereco,
			ArrayList<Telefone> telefones, String matricula, Date dataContratacao) {
		super(id, nome, cpf, sexo, dataNascimento, endereco, telefones);
		this.matricula = matricula;
		this.dataContratacao = dataContratacao;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(Date dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	@Override
	public Funcionario clone() {
		Funcionario funcionario = new Funcionario();
		
		funcionario.id = this.id;
		
		if (this.nome != null){
			funcionario.nome = new String(this.nome);
		}
		
		if (this.cpf != null){
			funcionario.cpf = new String(this.cpf);
		}
		 
		if (this.sexo != null){
			funcionario.sexo = new String(this.sexo);
		}
		 
		if (this.dataNascimento != null){
			funcionario.dataNascimento = new Date(this.dataNascimento.getTime());
		}
		
		if (this.endereco != null){
			funcionario.endereco = this.endereco.clone();
		}
		
		if (this.telefones != null){
			funcionario.telefones = new ArrayList<Telefone>();
			for (Telefone telefone : this.telefones) {
				funcionario.telefones.add(telefone.clone());
			}
		}
		
		if(this.matricula != null){
			funcionario.matricula = new String(this.matricula);
		}
		
		if (this.dataContratacao != null){
			funcionario.dataContratacao = new Date( this.dataContratacao.getTime());
		}
		return funcionario;
	}

}
