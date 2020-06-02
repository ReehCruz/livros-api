package com.rebeca.livros.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rebeca.livros.api.domain.Autor;

public interface AutoresRepository extends JpaRepository<Autor, Long> {

}
