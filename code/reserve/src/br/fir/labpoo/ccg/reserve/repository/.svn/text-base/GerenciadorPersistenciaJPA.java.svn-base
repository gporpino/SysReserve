package br.fir.labpoo.ccg.reserve.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

import br.fir.labpoo.ccg.reserve.exception.MecanismoTransacaoException;
import br.fir.labpoo.ccg.reserve.util.shutdown.ObjectShutdownHook;
import br.fir.labpoo.ccg.reserve.util.shutdown.ShutdownListener;

public class GerenciadorPersistenciaJPA implements ShutdownListener,
		ITransaction {
	private static final Logger LOG = Logger
			.getLogger(GerenciadorPersistenciaJPA.class);
	private String unitName;

	private EntityManagerFactory fabricaEM;

	private ThreadLocal<EntityManager> session = new ThreadLocal<EntityManager>();

	public GerenciadorPersistenciaJPA(String unitName) {
		Runtime.getRuntime().addShutdownHook(new ObjectShutdownHook(this));
		this.unitName = unitName;
	}

	private synchronized void loadInstance() {
		if (fabricaEM == null) {
			fabricaEM = Persistence.createEntityManagerFactory(unitName);
		}
	}

	public EntityManager obterEntityManagerCorrente() {
		EntityManager manager = session.get();
		LOG.debug("EntityManager requisitado");
		if (manager == null) {
			loadInstance();
			manager = fabricaEM.createEntityManager();
			session.set(manager);
			LOG.debug("Novo EntityManager criado");
		}
		return manager;
	}

	public void liberarEntityManager() {
		EntityManager manager = session.get();
		LOG.debug("Pedido de liberacao do EntityManager");
		if (manager != null) {
			EntityTransaction trans = manager.getTransaction();
			if (!trans.isActive()) {
				manager.close();
				LOG.debug("EntityManager liberado!!");
				session.set(null);
			}
		}
	}

	public void iniciarTransacao() throws MecanismoTransacaoException {
		LOG.debug("iniciando Transacao...");
		try {
			EntityTransaction trans = obterEntityManagerCorrente()
					.getTransaction();
			trans.begin();
			LOG.debug("Transacao Iniciada");
		} catch (RuntimeException e) {
			throw new MecanismoTransacaoException(e);
		}
	}

	public void commitTransacao() throws MecanismoTransacaoException {
		LOG.info("commiting Transacao...");
		try {
			EntityTransaction trans = obterEntityManagerCorrente()
					.getTransaction();
			trans.commit();
			liberarEntityManager();
			LOG.debug("Commit Transacao");
		} catch (RuntimeException e) {
			LOG.debug("commit error...");
			throw new MecanismoTransacaoException(e);
		}
	}

	public void rollbackTransacao() throws MecanismoTransacaoException {
		LOG.debug("rollbacking Transacao...");
		try {
			EntityTransaction trans = obterEntityManagerCorrente()
					.getTransaction();
			if (trans.isActive()) {
				trans.rollback();
			}
			liberarEntityManager();
			LOG.debug("Rollback Transacao");
		} catch (RuntimeException e) {
			LOG.debug("rollback error...");
			throw new MecanismoTransacaoException(e);
		}
	}

	public void onShutdown() throws Throwable {
		fabricaEM.close();
	}
}