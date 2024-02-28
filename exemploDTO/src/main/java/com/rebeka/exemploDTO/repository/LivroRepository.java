package com.rebeka.exemploDTO.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rebeka.exemploDTO.entities.Livro;

public interface LivroRepository  extends JpaRepository<Livro, Long>{

}
