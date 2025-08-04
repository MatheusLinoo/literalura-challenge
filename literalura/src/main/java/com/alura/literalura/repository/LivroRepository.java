package com.alura.literalura.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alura.literalura.model.Livro;

public interface LivroRepository extends JpaRepository<Livro,Long> {
    Optional<Livro> findByTitulo(String titulo);

    List<Livro>findByIdiomaContainingIgnoreCase(String idioma);

    List<Livro> findTop5ByOrderByDowloadsDesc();
}
