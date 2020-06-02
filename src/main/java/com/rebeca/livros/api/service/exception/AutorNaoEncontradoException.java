package com.rebeca.livros.api.service.exception;

public class AutorNaoEncontradoException extends RuntimeException {
	private static final long serialVersionUID = -2169213683352424061L;

	public AutorNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public AutorNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}
