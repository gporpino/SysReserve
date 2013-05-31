/**
 * 
 */
package br.fir.labpoo.ccg.reserve.business;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.factory.RepositoryFactory;
import br.fir.labpoo.ccg.reserve.model.Funcionario;
import br.fir.labpoo.ccg.reserve.model.Hospede;
import br.fir.labpoo.ccg.reserve.model.Pessoa;
import br.fir.labpoo.ccg.reserve.repository.memoria.RepositorioPessoaMemoria;

/**
 * @author cristiano
 *
 */
public class CadastroPessoa extends Cadastro<Pessoa> {
	
	public CadastroPessoa() throws RepositoryException{
		super(RepositoryFactory.getInstance().getRepositoryPessoa());
	}

	public Funcionario consultar(Funcionario funcionario) {
		RepositorioPessoaMemoria repositorio = (RepositorioPessoaMemoria) repository;
		return repositorio.consultar(funcionario);
	}
	
	public Hospede consultar(Hospede hospede) {
		RepositorioPessoaMemoria repositorio = (RepositorioPessoaMemoria) repository;
		return repositorio.consultar(hospede);
	}

	public Collection<Hospede> listarHospede() {
		RepositorioPessoaMemoria repositorio = (RepositorioPessoaMemoria) repository;
		List<Hospede> list = new ArrayList<Hospede>();
		
		for (Pessoa pessoa:repositorio.listar()){
			if (pessoa instanceof Hospede){
				list.add((Hospede) pessoa);
			}
		}
		
		return list;
	}
	
	public Collection<Funcionario> listarFuncionario() {
		RepositorioPessoaMemoria repositorio = (RepositorioPessoaMemoria) repository;
		List<Funcionario> list = new ArrayList<Funcionario>();

		for (Pessoa pessoa : repositorio.listar()) {
			if (pessoa instanceof Funcionario) {
				list.add((Funcionario) pessoa);
			}
		}

		return list;
	}
}
