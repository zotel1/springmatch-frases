package com.aluracursos.springmatch_frases.repository;

import com.aluracursos.springmatch_frases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraseRepository extends JpaRepository<Frase, Long> {

    Query("SELECT f FROM ")
}
