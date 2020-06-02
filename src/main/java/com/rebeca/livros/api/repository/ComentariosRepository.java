package com.rebeca.livros.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rebeca.livros.api.domain.Comentario;

public interface ComentariosRepository extends JpaRepository<Comentario, Long> {

}
