package br.fir.labpoo.ccg.reserve.business;

import br.fir.labpoo.ccg.reserve.exception.RepositoryException;
import br.fir.labpoo.ccg.reserve.factory.RepositoryFactory;
import br.fir.labpoo.ccg.reserve.model.UnidadeFederativa;

public class CadastroUnidadeFederativa extends Cadastro<UnidadeFederativa> {

	public CadastroUnidadeFederativa() throws RepositoryException{
		super(RepositoryFactory.getInstance().getRepositoryUnidadeFederativa());
	}
}
