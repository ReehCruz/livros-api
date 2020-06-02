package com.rebeca.livros.api.service.exception;

public class AutorExistenteException extends RuntimeException {
	private static final long serialVersionUID = 8697392292058665906L;
	
	public AutorExistenteException(String mensagem) {
		super(mensagem);
	}
	
	public AutorExistenteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}
