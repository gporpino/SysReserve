package br.fir.labpoo.ccg.reserve.factory;

import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.model.Apartamento;
import br.fir.labpoo.ccg.reserve.model.Cidade;
import br.fir.labpoo.ccg.reserve.model.Conta;
import br.fir.labpoo.ccg.reserve.model.Endereco;
import br.fir.labpoo.ccg.reserve.model.Hospedagem;
import br.fir.labpoo.ccg.reserve.model.Pessoa;
import br.fir.labpoo.ccg.reserve.model.Reserva;
import br.fir.labpoo.ccg.reserve.model.Servico;
import br.fir.labpoo.ccg.reserve.model.Telefone;
import br.fir.labpoo.ccg.reserve.model.Temporada;
import br.fir.labpoo.ccg.reserve.model.TipoApartamento;
import br.fir.labpoo.ccg.reserve.model.TipoTelefone;
import br.fir.labpoo.ccg.reserve.model.UnidadeFederativa;
import br.fir.labpoo.ccg.reserve.repository.IRepository;
import br.fir.labpoo.ccg.reserve.repository.jpa.IRepositoryJPAImpl;
import br.fir.labpoo.ccg.reserve.repository.jpa.RepositorioApartamentoJPA;
import br.fir.labpoo.ccg.reserve.repository.jpa.RepositorioCidadeJPA;
import br.fir.labpoo.ccg.reserve.repository.jpa.RepositorioContaJPA;
import br.fir.labpoo.ccg.reserve.repository.jpa.RepositorioEnderecoJPA;
import br.fir.labpoo.ccg.reserve.repository.jpa.RepositorioHospedagemJPA;
import br.fir.labpoo.ccg.reserve.repository.jpa.RepositorioPessoaJPA;
import br.fir.labpoo.ccg.reserve.repository.jpa.RepositorioReservaJPA;
import br.fir.labpoo.ccg.reserve.repository.jpa.RepositorioServicoJPA;
import br.fir.labpoo.ccg.reserve.repository.jpa.RepositorioTelefoneJPA;
import br.fir.labpoo.ccg.reserve.repository.jpa.RepositorioTemporadaJPA;
import br.fir.labpoo.ccg.reserve.repository.jpa.RepositorioTipoApartamentoJPA;
import br.fir.labpoo.ccg.reserve.repository.jpa.RepositorioTipoTelefoneJPA;
import br.fir.labpoo.ccg.reserve.repository.jpa.RepositorioUnidadeFederativaJPA;

public class RepositorioFactoryJPA extends RepositoryFactory {

	private static IRepositoryJPAImpl<Cidade> repositoryCidade = null;
	private static IRepositoryJPAImpl<Endereco> repositoryEndereco = null;
	private static IRepositoryJPAImpl<Pessoa> repositoryPessoa = null;
	private static IRepositoryJPAImpl<Conta> repositoryConta = null;
	private static IRepositoryJPAImpl<Hospedagem> repositoryHospedagem = null;
	private static IRepositoryJPAImpl<Reserva> repositoryReserva = null;
	private static IRepositoryJPAImpl<Servico> repositoryServico = null;
	private static IRepositoryJPAImpl<Telefone> repositoryTelefone = null;
	private static IRepositoryJPAImpl<TipoTelefone> repositoryTipoTelefone = null;
	private static IRepositoryJPAImpl<Temporada> repositoryTemporada = null;
	private static IRepositoryJPAImpl<UnidadeFederativa> repositoryUnidadeFederativa = null;
	private static IRepositoryJPAImpl<Apartamento> repositoryApartamento = null;
	private static IRepositoryJPAImpl<TipoApartamento> repositoryTipoApartamento = null;


	public IRepository<Cidade> getRepositoryCidade() throws RepositoryException{
		if(repositoryCidade == null) {
			repositoryCidade = new RepositorioCidadeJPA();
		}
		return repositoryCidade;
	}

	public IRepository<Conta> getRepositoryConta() throws RepositoryException{
		if(repositoryConta == null) {
			repositoryConta = new RepositorioContaJPA();
		}
		return repositoryConta;
	}


	public IRepository<Endereco> getRepositoryEndereco() throws RepositoryException{
		if(repositoryEndereco == null) {
			repositoryEndereco = new RepositorioEnderecoJPA();
		}
		return repositoryEndereco;
	}

	public IRepository<Pessoa> getRepositoryPessoa() throws RepositoryException{
		if(repositoryPessoa == null) {
			repositoryPessoa = new RepositorioPessoaJPA();
		}
		return repositoryPessoa;
	}

	public IRepository<Hospedagem> getRepositoryHospedagem() throws RepositoryException{
		if(repositoryHospedagem == null) {
			repositoryHospedagem = new RepositorioHospedagemJPA();
		}
		return repositoryHospedagem;
	}

	public IRepository<Reserva> getRepositoryReserva() throws RepositoryException{
		if(repositoryReserva == null) {
			repositoryReserva = new RepositorioReservaJPA();
		}
		return repositoryReserva;
	}

	public IRepository<Servico> getRepositoryServico() throws RepositoryException{
		if(repositoryServico == null) {
			repositoryServico = new RepositorioServicoJPA();
		}
		return repositoryServico;
	}

	public IRepository<Telefone> getRepositoryTelefone() throws RepositoryException{
		if(repositoryTelefone == null) {
			repositoryTelefone = new RepositorioTelefoneJPA();
		}
		return repositoryTelefone;
	}

	public IRepository<TipoTelefone> getRepositoryTipoTelefone() throws RepositoryException{
		if(repositoryTipoTelefone == null) {
			repositoryTipoTelefone = new RepositorioTipoTelefoneJPA();
		}
		return repositoryTipoTelefone;
	}

	public IRepository<Temporada> getRepositoryTemporada() throws RepositoryException {
		if(repositoryTemporada == null) {
			repositoryTemporada = new RepositorioTemporadaJPA();
		}
		return repositoryTemporada;
	}

	public IRepository<UnidadeFederativa> getRepositoryUnidadeFederativa() throws RepositoryException {
		if(repositoryUnidadeFederativa == null) {
			repositoryUnidadeFederativa = new RepositorioUnidadeFederativaJPA();
		}
		return repositoryUnidadeFederativa;
	}

	public IRepository<Apartamento> getRepositoryApartamento() throws RepositoryException {
		if(repositoryApartamento == null) {
			repositoryApartamento = new RepositorioApartamentoJPA();
		}
		return repositoryApartamento;
	}
	
	public IRepository<TipoApartamento> getRepositoryTipoApartamento() throws RepositoryException {
		if(repositoryTipoApartamento == null) {
			repositoryTipoApartamento = new RepositorioTipoApartamentoJPA();
		}
		return repositoryTipoApartamento;
	}
}
