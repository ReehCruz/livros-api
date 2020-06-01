package com.rebeca.livros.api.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rebeca.livros.api.domain.Livro;

@RestController
public class LivrosResourses {
	
	
	@RequestMapping(value="/livros", method = RequestMethod.GET)
	public List<Livro> listar() {
		
		Livro l1 = new Livro("livro 1");
		Livro l2 = new Livro("livro 2");
		
		Livro[] livros = {l1,l2};
		
		return Arrays.asList(livros);
	}

}
