package com.rebeca.livros.api.service.exception;

public class LivroNaoEncontradoException extends RuntimeException {
	private static final long serialVersionUID = 8870076934630271484L;

	public LivroNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public LivroNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}
