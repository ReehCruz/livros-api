package com.rebeca.livros.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rebeca.livros.api.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long>{ 

}
