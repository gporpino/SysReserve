package br.fir.labpoo.ccg.reserve.factory;

import java.io.IOException;
import java.util.Properties;

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

public abstract class RepositoryFactory {

	private static RepositoryFactory factory;

	// public static RepositoryFactory getInstance() {
	//
	// if (factory == null) {
	//
	// String path = "br/fir/labpoo/ccg/reserve/sysreserva.properties";
	//
	// ClassLoader loader = ClassLoader.getSystemClassLoader();
	// Properties propriedades = new Properties();
	// try {
	// propriedades.load(loader.getResourceAsStream(path));
	// } catch (IOException ioe) {
	// throw new MissingResourceException(
	// "Arquivo de configurações do sistema não foi criado: "
	// + path, "RepositorioFactory", "tipoRepositorio");
	// }
	//
	// String property = "tipoRepositorio";
	//
	// if ("memoria".equals(propriedades.getProperty(property))) {
	// factory = new RepositorioFactoryMemoria();
	// } else if ("banco".equals(propriedades.getProperty(property))) {
	// factory = new RepositorioFactoryBanco();
	// } else {
	// throw new MissingResourceException(
	// "O parâmetro informado está fora do escopo aceitável para essa
	// propriedade do arquivo : "
	// + path, RepositoryFactory.class
	// .getSimpleName(), property);
	// }
	// }
	// return factory;
	// }

	public static RepositoryFactory getInstance() throws RepositoryException {
		ClassLoader loader = RepositoryFactory.class.getClassLoader();
		Properties pro = new Properties();
		try {
			pro.load(loader.getResourceAsStream("br/fir/labpoo/ccg/reserve/reserve.properties"));

			Class<?> cls = (Class<?>) loader.loadClass(pro.getProperty("factoryClass"));
			factory = (RepositoryFactory) cls.newInstance();
			return factory;
		} catch (IOException ioe) {
			throw new RepositoryException(ioe);
		} catch (ClassNotFoundException e) {
			throw new RepositoryException(e);
		} catch (InstantiationException e) {
			throw new RepositoryException(e);
		} catch (IllegalAccessException e) {
			throw new RepositoryException(e);
		}
	}

	public abstract IRepository<Cidade> getRepositoryCidade() throws RepositoryException;

	public abstract IRepository<Conta> getRepositoryConta() throws RepositoryException;

	public abstract IRepository<Endereco> getRepositoryEndereco() throws RepositoryException;

	public abstract IRepository<Pessoa> getRepositoryPessoa() throws RepositoryException;

	public abstract IRepository<Hospedagem> getRepositoryHospedagem() throws RepositoryException;

	public abstract IRepository<Reserva> getRepositoryReserva() throws RepositoryException;

	public abstract IRepository<Servico> getRepositoryServico() throws RepositoryException;

	public abstract IRepository<Telefone> getRepositoryTelefone() throws RepositoryException;

	public abstract IRepository<TipoTelefone> getRepositoryTipoTelefone() throws RepositoryException;

	public abstract IRepository<Temporada> getRepositoryTemporada() throws RepositoryException;

	public abstract IRepository<UnidadeFederativa> getRepositoryUnidadeFederativa() throws RepositoryException;

	public abstract IRepository<Apartamento> getRepositoryApartamento() throws RepositoryException;

	public abstract IRepository<TipoApartamento> getRepositoryTipoApartamento() throws RepositoryException;
}
