package br.com.clientes.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.clientes.api.model.Cliente;
import br.com.clientes.api.repository.ClienteRepository;

@RestController
public class Controller {

    @Autowired
    private ClienteRepository acao;

    @PostMapping("/")
    public Cliente cadastrar(@RequestBody Cliente c) {
        return acao.save(c);
    }

}
