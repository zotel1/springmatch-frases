package com.aluracursos.springmatch_frases.controller;

import com.aluracursos.springmatch_frases.dto.FraseDTO;
import com.aluracursos.springmatch_frases.repository.FraseRepository;
import com.aluracursos.springmatch_frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    private FraseService servicio;

    @GetMapping("/series/frases")
    public FraseDTO obtenerFraseAleatoria(){
        return servicio.obtenerFraseAleatoria();
    }
}
