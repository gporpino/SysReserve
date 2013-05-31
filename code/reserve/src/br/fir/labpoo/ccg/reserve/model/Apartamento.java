/**
 *
 */
package br.fir.labpoo.ccg.reserve.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author clelia
 *
 */
@Entity
public class Apartamento extends BasicClass {

	// Declaração de atributos
	@Id 
	private int id;
	
	private String nome;

	private int qtdCamas;

	private double taxa;

	// Construtor
	public Apartamento() {
	}

	// Sobrecarga de construtor.
	public Apartamento(int id, String nome, int qtdCamas, double taxa) {
		this.id = id;
		this.nome = nome;
		this.qtdCamas = qtdCamas;
		this.taxa = taxa;
	}

	// Metodos GET
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public int getQtdCamas() {
		return qtdCamas;
	}

	public double getTaxa() {
		return taxa;
	}

	// Metodos SET
	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setQtdCamas(int qtdCamas) {
		this.qtdCamas = qtdCamas;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	@Override
	public Apartamento clone() {
		
		Apartamento apartamento = new Apartamento();
		apartamento.id = this.id;
		if(this.nome != null){
			apartamento.nome = new String(this.nome);
		}
		apartamento.qtdCamas = this.qtdCamas;
		apartamento.taxa = this.taxa;
		
		return apartamento;
	}

}
