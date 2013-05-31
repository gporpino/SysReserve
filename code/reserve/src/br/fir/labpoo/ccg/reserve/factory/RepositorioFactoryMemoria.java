package br.fir.labpoo.ccg.reserve.factory;

import br.fir.labpoo.ccg.reserve.repository.memoria.RepositorioApartamentoMemoria;
import br.fir.labpoo.ccg.reserve.repository.memoria.RepositorioCidadeMemoria;
import br.fir.labpoo.ccg.reserve.repository.memoria.RepositorioContaMemoria;
import br.fir.labpoo.ccg.reserve.repository.memoria.RepositorioEnderecoMemoria;
import br.fir.labpoo.ccg.reserve.repository.memoria.RepositorioHospedagemMemoria;
import br.fir.labpoo.ccg.reserve.repository.memoria.RepositorioPessoaMemoria;
import br.fir.labpoo.ccg.reserve.repository.memoria.RepositorioReservaMemoria;
import br.fir.labpoo.ccg.reserve.repository.memoria.RepositorioServicoMemoria;
import br.fir.labpoo.ccg.reserve.repository.memoria.RepositorioTelefoneMemoria;
import br.fir.labpoo.ccg.reserve.repository.memoria.RepositorioTemporadaMemoria;
import br.fir.labpoo.ccg.reserve.repository.memoria.RepositorioTipoApartamentoMemoria;
import br.fir.labpoo.ccg.reserve.repository.memoria.RepositorioTipoTelefoneMemoria;
import br.fir.labpoo.ccg.reserve.repository.memoria.RepositorioUnidadeFederativaMemoria;

public class RepositorioFactoryMemoria extends RepositoryFactory{

	private RepositorioCidadeMemoria repositoryCidade;
	private RepositorioContaMemoria repositoryConta;
	private RepositorioEnderecoMemoria repositoryEndereco;
	private RepositorioHospedagemMemoria repositoryHospedagem;
	private RepositorioPessoaMemoria repositoryPessoa;
	private RepositorioReservaMemoria repositoryReserva;
	private RepositorioServicoMemoria repositoryServico;
	private RepositorioTelefoneMemoria repositoryTelefone;
	private RepositorioTemporadaMemoria repositoryTemporada;
	private RepositorioTipoTelefoneMemoria repositoryTipoTelefone;
	private RepositorioUnidadeFederativaMemoria repositoryUnidadeFederativa;
	private RepositorioApartamentoMemoria repositoryApartamento;
	private RepositorioTipoApartamentoMemoria repositoryTipoApartamento;
	
	
	@Override
	public RepositorioCidadeMemoria getRepositoryCidade() {
		if(repositoryCidade == null) {
			repositoryCidade = new RepositorioCidadeMemoria();
		}
		return repositoryCidade;
	}

	@Override
	public RepositorioContaMemoria getRepositoryConta() {
		if(repositoryConta == null) {
			repositoryConta = new RepositorioContaMemoria();
		}
		return repositoryConta;
	}

	@Override
	public RepositorioEnderecoMemoria getRepositoryEndereco() {
		if(repositoryEndereco == null) {
			repositoryEndereco = new RepositorioEnderecoMemoria();
		}
		return repositoryEndereco;
	}

	@Override
	public RepositorioHospedagemMemoria getRepositoryHospedagem() {
		if(repositoryHospedagem == null) {
			repositoryHospedagem = new RepositorioHospedagemMemoria();
		}
		return repositoryHospedagem;
	}

	@Override
	public RepositorioPessoaMemoria getRepositoryPessoa() {
		if(repositoryPessoa == null) {
			repositoryPessoa = new RepositorioPessoaMemoria();
		}
		return repositoryPessoa;
	}

	@Override
	public RepositorioReservaMemoria getRepositoryReserva() {
		if(repositoryReserva == null) {
			repositoryReserva = new RepositorioReservaMemoria();
		}
		return repositoryReserva;
	}

	@Override
	public RepositorioServicoMemoria getRepositoryServico() {
		if(repositoryServico == null) {
			repositoryServico = new RepositorioServicoMemoria();
		}
		return repositoryServico;
	}

	@Override
	public RepositorioTelefoneMemoria getRepositoryTelefone() {
		if(repositoryTelefone == null) {
			repositoryTelefone = new RepositorioTelefoneMemoria();
		}
		return repositoryTelefone;
	}

	@Override
	public RepositorioTemporadaMemoria getRepositoryTemporada() {
		if(repositoryTemporada == null) {
			repositoryTemporada = new RepositorioTemporadaMemoria();
		}
		return repositoryTemporada;
	}

	@Override
	public RepositorioTipoTelefoneMemoria getRepositoryTipoTelefone() {
		if(repositoryTipoTelefone == null) {
			repositoryTipoTelefone = new RepositorioTipoTelefoneMemoria();
		}
		return repositoryTipoTelefone;
	}

	@Override
	public RepositorioUnidadeFederativaMemoria getRepositoryUnidadeFederativa() {
		if(repositoryUnidadeFederativa == null) {
			repositoryUnidadeFederativa = new RepositorioUnidadeFederativaMemoria();
		}
		return repositoryUnidadeFederativa;
	}

	@Override
	public RepositorioApartamentoMemoria getRepositoryApartamento() {
		if(repositoryApartamento == null) {
			repositoryApartamento = new RepositorioApartamentoMemoria();
		}
		return repositoryApartamento;
	}
	
	@Override
	public RepositorioTipoApartamentoMemoria getRepositoryTipoApartamento() {
		if(repositoryTipoApartamento == null) {
			repositoryTipoApartamento = new RepositorioTipoApartamentoMemoria();
		}
		return repositoryTipoApartamento;
	}
	
}
