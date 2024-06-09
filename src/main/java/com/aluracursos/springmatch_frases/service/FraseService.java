package com.aluracursos.springmatch_frases.service;

import com.aluracursos.springmatch_frases.controller.FraseController;
import com.aluracursos.springmatch_frases.dto.FraseDTO;
import com.aluracursos.springmatch_frases.model.Frase;
import com.aluracursos.springmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;
    public FraseDTO obtenerFraseAleatoria() {
        Frase frase = repository.obtenerFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonaje(), frase.getPoster());
    }
}
