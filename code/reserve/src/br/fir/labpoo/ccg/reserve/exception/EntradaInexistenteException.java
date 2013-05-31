package br.fir.labpoo.ccg.reserve.exception;

public class EntradaInexistenteException extends NullPointerException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EntradaInexistenteException() {
		super("N�o foi retornado nenhum resultado da opera��o realizada.");
	}
	
	public EntradaInexistenteException(String eie) {
		super(eie);
	}
	
	public EntradaInexistenteException(int codigoErro) {
		super("Ocorreu um erro com o seguinte c�digo: "+codigoErro);
	}

}
