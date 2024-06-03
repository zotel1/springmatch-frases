package com.aluracursos.springmatch_frases.service;

import com.aluracursos.springmatch_frases.controller.FraseController;
import com.aluracursos.springmatch_frases.dto.FraseDTO;
import com.aluracursos.springmatch_frases.model.Frase;

public class FraseService {
    private FraseController repository;
    Frase frase = repository.obtenerFraseAleatoria();
    return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.)
}
