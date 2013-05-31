package br.fir.labpoo.ccg.reserve.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Conta extends BasicClass {
	
	@Id
	private int id;
	@OneToOne
	private Hospedagem hospedagem;
	
	private List<Servico> servicos;

	/**
	 *
	 *
	 */
	public Conta() {}

	/**
	 * @param id
	 * @param hospedagem
	 * @param servicos
	 */
	public Conta(int id, Hospedagem hospedagem, List<Servico> servicos) {
		this.id = id;
		this.hospedagem = hospedagem;
		this.servicos = servicos;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the hospedagem
	 */
	public Hospedagem getHospedagem() {
		return hospedagem;
	}

	/**
	 * @param hospedagem the hospedagem to set
	 */
	public void setHospedagem(Hospedagem hospedagem) {
		this.hospedagem = hospedagem;
	}

	/**
	 * @return the servicos
	 */
	public List<Servico> getServicos() {
		return servicos;
	}

	/**
	 * @param servicos the servicos to set
	 */
	public void setServicos(ArrayList<Servico> servicos) {
		this.servicos = servicos;
	}

	@Override
	public Conta clone() {
		Conta conta = new Conta();
		conta.id = this.id;
		if (this.hospedagem != null){
			conta.hospedagem = this.hospedagem.clone();
		}
		
		if(this.servicos != null){
			conta.servicos = new ArrayList<Servico>();
			for (Servico servico : this.servicos) {
				conta.servicos.add(servico.clone());
			}
		}
		
		return conta;
	}
	
}
