package br.fir.labpoo.ccg.reserve.exception;

public class TemporadaInexistenteException extends RuntimeException {

private static final long serialVersionUID = 1L;

public TemporadaInexistenteException(){
		super("Não foi encontrada nenhuma temporada para o período solicitado.");
	}

}
