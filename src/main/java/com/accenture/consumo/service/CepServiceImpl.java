package com.accenture.consumo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.consumo.interfaces.CepService;
import com.accenture.consumo.model.Endereco;
import com.accenture.consumo.repository.CEPsRepository;

@Service
public class CepServiceImpl {

    @Autowired
    private CepService cepClient;

    @Autowired
    private CEPsRepository repository;

    public Endereco buscaEGravaEnderecoPorCep(String cep) {
        // Busca na API externa
        Endereco endereco = cepClient.buscaEnderecoPorCep(cep);

        // Salva no banco de dados
        return repository.save(endereco);
    }
}
