package com.accenture.consumo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.consumo.model.Endereco;
import com.accenture.consumo.service.CepServiceImpl;

@RestController
public class CepRestController {

    @Autowired
    private CepServiceImpl service;

    @GetMapping("/{cep}")
    public Endereco buscarEndereco(@PathVariable String cep) {
        return service.buscaEGravaEnderecoPorCep(cep);
    }
}
