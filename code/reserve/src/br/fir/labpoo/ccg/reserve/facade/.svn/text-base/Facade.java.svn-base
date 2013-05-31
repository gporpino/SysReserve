package br.fir.labpoo.ccg.reserve.facade;

import java.util.Collection;
import java.util.Date;

import br.fir.labpoo.ccg.reserve.business.CadastroApartamento;
import br.fir.labpoo.ccg.reserve.business.CadastroCidade;
import br.fir.labpoo.ccg.reserve.business.CadastroConta;
import br.fir.labpoo.ccg.reserve.business.CadastroEndereco;
import br.fir.labpoo.ccg.reserve.business.CadastroHospedagem;
import br.fir.labpoo.ccg.reserve.business.CadastroPessoa;
import br.fir.labpoo.ccg.reserve.business.CadastroReserva;
import br.fir.labpoo.ccg.reserve.business.CadastroServico;
import br.fir.labpoo.ccg.reserve.business.CadastroTelefone;
import br.fir.labpoo.ccg.reserve.business.CadastroTemporada;
import br.fir.labpoo.ccg.reserve.business.CadastroTipoApartamento;
import br.fir.labpoo.ccg.reserve.business.CadastroTipoTelefone;
import br.fir.labpoo.ccg.reserve.business.CadastroUnidadeFederativa;
import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.model.Apartamento;
import br.fir.labpoo.ccg.reserve.model.Cidade;
import br.fir.labpoo.ccg.reserve.model.Conta;
import br.fir.labpoo.ccg.reserve.model.Endereco;
import br.fir.labpoo.ccg.reserve.model.Funcionario;
import br.fir.labpoo.ccg.reserve.model.Hospedagem;
import br.fir.labpoo.ccg.reserve.model.Hospede;
import br.fir.labpoo.ccg.reserve.model.Reserva;
import br.fir.labpoo.ccg.reserve.model.Servico;
import br.fir.labpoo.ccg.reserve.model.Telefone;
import br.fir.labpoo.ccg.reserve.model.Temporada;
import br.fir.labpoo.ccg.reserve.model.TipoApartamento;
import br.fir.labpoo.ccg.reserve.model.TipoTelefone;
import br.fir.labpoo.ccg.reserve.model.UnidadeFederativa;

public class Facade {

	private static Facade instancia = null;
	private CadastroPessoa cadastroPessoa;
	private CadastroApartamento cadastroApartamento;
	private CadastroTemporada cadastroTemporada;
	private CadastroServico cadastroServico;
	private CadastroEndereco cadastroEndereco;
	private CadastroCidade cadastroCidade;
	private CadastroUnidadeFederativa cadastroUnidadeFederativa;
	private CadastroTelefone cadastroTelefone;
	private CadastroTipoTelefone cadastroTipoTelefone;
	private CadastroConta cadastroConta;
	private CadastroHospedagem cadastroHospedagem;
	private CadastroReserva cadastroReserva;
	private CadastroTipoApartamento cadastroTipoApartamento;

	protected Facade() {
		try {
			cadastroApartamento = new CadastroApartamento();
			cadastroTemporada = new CadastroTemporada();
			cadastroPessoa = new CadastroPessoa();
			cadastroEndereco = new CadastroEndereco();
			cadastroServico = new CadastroServico();
			cadastroCidade = new CadastroCidade();
			cadastroUnidadeFederativa = new CadastroUnidadeFederativa();
			cadastroTelefone = new CadastroTelefone();
			cadastroTipoTelefone = new CadastroTipoTelefone();
			cadastroConta = new CadastroConta();
			cadastroHospedagem = new CadastroHospedagem();
			cadastroReserva = new CadastroReserva();
			cadastroTipoApartamento = new CadastroTipoApartamento();

		} catch (RepositoryException e) {
			// TODO Tratar as Exceptions de Repositorio
			e.printStackTrace();
		}
	}

	public static Facade getInstacia() {
		if (instancia == null) {
			synchronized (Facade.class) {
				if (instancia == null) {
					instancia = new Facade();
				}
			}
		}
		return instancia;
	}

	/*
	 * ============================== Funcionário
	 * ===============================
	 */
	public void save(Funcionario funcionario) throws RepositoryException {
		cadastroPessoa.inserir(funcionario);
	}

	public void alterar(Funcionario funcionario) throws RepositoryException {
		cadastroPessoa.alterar(funcionario);
	}

	public void excluir(Funcionario funcionario) throws RepositoryException {
		cadastroPessoa.excluir(funcionario);
	}

	public Funcionario consultar(Funcionario funcionario) throws RepositoryException {
		return cadastroPessoa.consultar(funcionario);
	}

	/*
	 * ============================ Apartamento ===============================
	 */
	public void save(Apartamento apartamento) throws RepositoryException {
		cadastroApartamento.inserir(apartamento);
	}

	public void alterar(Apartamento apartamento) throws RepositoryException {
		cadastroApartamento.alterar(apartamento);
	}

	public void excluir(Apartamento apartamento) throws RepositoryException {
		cadastroApartamento.excluir(apartamento);
	}

	public Apartamento consultar(Apartamento apartamento) throws RepositoryException {
		return cadastroApartamento.consultar(apartamento);
	}

	/*
	 * ============================== Temporada ===============================
	 */
	public void save(Temporada temporada) throws RepositoryException {
		cadastroTemporada.inserir(temporada);
	}

	public void alterar(Temporada temporada) throws RepositoryException {
		cadastroTemporada.alterar(temporada);
	}

	public void excluir(Temporada temporada) throws RepositoryException {
		cadastroTemporada.excluir(temporada);
	}

	public Temporada consultar(Temporada temporada) throws RepositoryException {
		return cadastroTemporada.consultar(temporada);
	}

	public Temporada consultarTemporada(Date inicio, Date fim) throws RepositoryException {
		return cadastroTemporada.consultar(inicio, fim);
	}

	/*
	 * ============================== Hospede ===============================
	 */
	public void save(Hospede hospede) throws RepositoryException {
		cadastroPessoa.inserir(hospede);
	}

	public void alterar(Hospede hospede) throws RepositoryException {
		cadastroPessoa.alterar(hospede);
	}

	public void excluir(Hospede hospede) throws RepositoryException {
		cadastroPessoa.excluir(hospede);
	}

	public Hospede consultar(Hospede hospede) throws RepositoryException {
		return cadastroPessoa.consultar(hospede);
	}

	/*
	 * ============================== Servico ===============================
	 */
	public void save(Servico servico) throws RepositoryException {
		cadastroServico.inserir(servico);
	}

	public void alterar(Servico servico) throws RepositoryException {
		cadastroServico.alterar(servico);
	}

	public void excluir(Servico servico) throws RepositoryException {
		cadastroServico.excluir(servico);
	}

	public Servico consultar(Servico servico) throws RepositoryException {
		return cadastroServico.consultar(servico);
	}

	/*
	 * ============================== Endereco ===============================
	 */
	public void save(Endereco endereco) throws RepositoryException {
		cadastroEndereco.inserir(endereco);
	}

	public void alterar(Endereco endereco) throws RepositoryException {
		cadastroEndereco.alterar(endereco);
	}

	public void excluir(Endereco endereco) throws RepositoryException {
		cadastroEndereco.excluir(endereco);
	}

	/*
	 * ============================== Cidade ===============================
	 */
	public void inserir(Cidade cidade) throws RepositoryException {
		cadastroCidade.inserir(cidade);
	}

	public void alterar(Cidade cidade) throws RepositoryException {
		cadastroCidade.alterar(cidade);
	}

	public void excluir(Cidade cidade) throws RepositoryException {
		cadastroCidade.excluir(cidade);
	}

	/*
	 * ============================== UnidadeFederativa
	 * ===============================
	 */
	public void save(UnidadeFederativa unidadeFederativa) throws RepositoryException {
		cadastroUnidadeFederativa.inserir(unidadeFederativa);
	}

	public void alterar(UnidadeFederativa unidadeFederativa) throws RepositoryException {
		cadastroUnidadeFederativa.alterar(unidadeFederativa);
	}

	public void excluir(UnidadeFederativa unidadeFederativa) throws RepositoryException {
		cadastroUnidadeFederativa.excluir(unidadeFederativa);
	}

	/*
	 * ============================== Telefone ===============================
	 */
	public void save(Telefone telefone) throws RepositoryException {
		cadastroTelefone.inserir(telefone);
	}

	public void alterar(Telefone telefone) throws RepositoryException {
		cadastroTelefone.alterar(telefone);
	}

	public void excluir(Telefone telefone) throws RepositoryException {
		cadastroTelefone.excluir(telefone);
	}

	/*
	 * ============================== TipoTelefone
	 * ===============================
	 */
	public void save(TipoTelefone tipoTelefone) throws RepositoryException {
		cadastroTipoTelefone.inserir(tipoTelefone);
	}

	public void alterar(TipoTelefone tipoTelefone) throws RepositoryException {
		cadastroTipoTelefone.alterar(tipoTelefone);
	}

	public void excluir(TipoTelefone tipoTelefone) throws RepositoryException {
		cadastroTipoTelefone.excluir(tipoTelefone);
	}

	/*
	 * ============================== Conta ===============================
	 */
	public void save(Conta conta) throws RepositoryException {
		cadastroConta.inserir(conta);
	}

	public void alterar(Conta conta) throws RepositoryException {
		cadastroConta.alterar(conta);
	}

	public void excluir(Conta conta) throws RepositoryException {
		cadastroConta.excluir(conta);
	}

	public Conta consultar(Conta conta) throws RepositoryException {
		return cadastroConta.consultar(conta);
	}

	public double getValorConta(Conta conta, Temporada temporada) throws RepositoryException {
		return cadastroConta.getValorConta(conta, temporada);
	}

	/*
	 * ============================== Hospedage ===============================
	 */
	public void save(Hospedagem hospedagem) throws RepositoryException {
		cadastroHospedagem.inserir(hospedagem);
	}

	public void alterar(Hospedagem hospedagem) throws RepositoryException {
		cadastroHospedagem.alterar(hospedagem);
	}

	public void excluir(Hospedagem hospedagem) throws RepositoryException {
		cadastroHospedagem.excluir(hospedagem);
	}

	public Hospedagem consultar(Hospedagem hospedagem) throws RepositoryException {
		return cadastroHospedagem.consultar(hospedagem);
	}

	/*
	 * ============================== Reserva ===============================
	 */
	public void save(Reserva reserva) throws RepositoryException {
		cadastroReserva.inserir(reserva);
	}

	public void alterar(Reserva reserva) throws RepositoryException {
		cadastroReserva.alterar(reserva);
	}

	public void excluir(Reserva reserva) throws RepositoryException {
		cadastroReserva.excluir(reserva);
	}

	public Reserva consultar(Reserva reserva) throws RepositoryException {
		return cadastroReserva.consultar(reserva);
	}

	/*
	 * =========================== Tipo Apartamento ===========================
	 */
	public void save(TipoApartamento tipoApartamento) throws RepositoryException {
		cadastroTipoApartamento.inserir(tipoApartamento);
	}

	public void alterar(TipoApartamento tipoApartamento) throws RepositoryException {
		cadastroTipoApartamento.alterar(tipoApartamento);
	}

	public void excluir(TipoApartamento tipoApartamento) throws RepositoryException {
		cadastroTipoApartamento.excluir(tipoApartamento);
	}

	public TipoApartamento consultar(TipoApartamento tipoApartamento) throws RepositoryException {
		return cadastroTipoApartamento.consultar(tipoApartamento);
	}

	/*
	 * ============================== LISTAGEM ===============================
	 */

	public Collection<Hospede> listarHospede() throws RepositoryException {
		return cadastroPessoa.listarHospede();
	}

	public Collection<Apartamento> listarApartamento() throws RepositoryException {
		return cadastroApartamento.listar();
	}

	public Collection<TipoApartamento> listarTipoApartamento() throws RepositoryException {
		return cadastroTipoApartamento.listar();
	}

	public Collection<Reserva> listarReserva() throws RepositoryException {
		return cadastroReserva.listar();
	}

	public Collection<Servico> listarServico() throws RepositoryException {
		return cadastroServico.listar();
	}

	public Collection<Temporada> listarTemporada() throws RepositoryException {
		return cadastroTemporada.listar();
	}
}
