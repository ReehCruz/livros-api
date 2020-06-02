package com.rebeca.livros.api.service.exception;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -6337877836448913096L;

	public ObjectNotFoundException(String msg) {
		super(msg);
	}	
	
	public ObjectNotFoundException(String msg, Throwable cause) {
		super (msg, cause);
	}
}
