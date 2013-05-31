package br.fir.labpoo.ccg.reserve.repository;

import br.fir.labpoo.ccg.reserve.exception.MecanismoTransacaoException;


public interface ITransaction {

	public void iniciarTransacao() throws MecanismoTransacaoException;

	public void commitTransacao() throws MecanismoTransacaoException;

	public void rollbackTransacao() throws MecanismoTransacaoException;

}