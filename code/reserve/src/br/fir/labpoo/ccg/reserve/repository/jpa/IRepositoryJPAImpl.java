package br.fir.labpoo.ccg.reserve.repository.jpa;

import java.lang.reflect.ParameterizedType;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import br.fir.labpoo.ccg.reserve.exception.EntradaInexistenteException;
import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.model.BasicClass;
import br.fir.labpoo.ccg.reserve.repository.GerenciadorPersistenciaJPA;
import br.fir.labpoo.ccg.reserve.repository.IRepository;

public class IRepositoryJPAImpl<Type extends BasicClass> implements
		IRepository<Type> {

	private static final String PERSISTENCE_UNIT = "ReservePersistenceUnit";

	private static GerenciadorPersistenciaJPA gerenciador;
	private Class<Type> classe;

	@SuppressWarnings("unchecked")
	public IRepositoryJPAImpl() throws RepositoryException {
		if (gerenciador == null) {
			gerenciador = new GerenciadorPersistenciaJPA(PERSISTENCE_UNIT);
		}

		this.classe = (Class<Type>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@Override
	public void inserir(Type type) throws RepositoryException {
		try {
			EntityManager em = gerenciador.obterEntityManagerCorrente();
			EntityTransaction tx = em.getTransaction();
			if (tx.isActive()) {
				em.persist(type);
			} else {
				tx.begin();
				em.persist(type);
				tx.commit();
			}
		} catch (RuntimeException e) {
			throw new RepositoryException(e);
		} finally {
			gerenciador.liberarEntityManager();
		}
	}

	@Override
	public void alterar(Type type) throws EntradaInexistenteException,
			RepositoryException {
		try {
			EntityManager em = gerenciador.obterEntityManagerCorrente();
			EntityTransaction tx = em.getTransaction();
			if (tx.isActive()) {
				em.merge(type);
			} else {
				tx.begin();
				em.persist(type);
				tx.commit();
			}
		} catch (RuntimeException e) {
			throw new RepositoryException(e);
		} finally {
			gerenciador.liberarEntityManager();
		}
	}

	@Override
	public void excluir(Type type) throws EntradaInexistenteException,
			RepositoryException {
		try {
			EntityManager em = gerenciador.obterEntityManagerCorrente();
			EntityTransaction tx = em.getTransaction();
			if (tx.isActive()) {
				em.remove(type);
			} else {
				tx.begin();
				em.persist(type);
				tx.commit();
			}
		} catch (RuntimeException e) {
			throw new RepositoryException(e);
		} finally {
			gerenciador.liberarEntityManager();
		}
	}

	@Override
	public Type consultar(Type type) throws RepositoryException {
		// Type resp;
		// Query query;
		// try {
		// query = gerenciador.obterEntityManagerCorrente().createQuery("SELECT
		// d FROM "+ classe.getSimpleName() +" d WHERE "+ type.getId());
		// resp = (Type)query.getSingleResult();
		// } catch (RuntimeException e) {
		// throw new RepositoryException(e);
		// } finally {
		// gerenciador.liberarEntityManager();
		// }

		return executeSimple("SELECT d FROM " + classe.getSimpleName()
				+ " d WHERE id=" + type.getId());
	}

	@Override
	public Collection<Type> listar() throws RepositoryException {
		return executeList("SELECT d FROM " + classe.getSimpleName() + " d");
	}

	public Collection<Type> getDados() throws RepositoryException {
		return executeList("SELECT d FROM " + classe.getSimpleName() + " d");
	}

	protected Collection<Type> executeList(String queryStr)
			throws RepositoryException {
		try {
			return gerenciador.obterEntityManagerCorrente().createQuery(
					queryStr).getResultList();
		} catch (RuntimeException e) {
			throw new RepositoryException(e);
		}
	}

	protected Type executeSimple(String queryStr)
			throws RepositoryException {
		try {
			return (Type)gerenciador.obterEntityManagerCorrente().createQuery(
					queryStr).getSingleResult();
		} catch (RuntimeException e) {
			throw new RepositoryException(e);
		}
	}

}
