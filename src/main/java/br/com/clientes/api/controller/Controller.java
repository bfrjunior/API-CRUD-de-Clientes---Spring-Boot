package br.com.clientes.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.clientes.api.model.Cliente;
import br.com.clientes.api.repository.ClienteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class Controller {

    @Autowired
    private ClienteRepository acao;

    @PostMapping("/cadastrar")
    public Cliente cadastrar(@RequestBody Cliente c) {
        return acao.save(c);
    }

    @GetMapping("/list")
    public Iterable<Cliente> selecionar() {
        return acao.findAll();
    }

    @PutMapping("/editar")
    public Cliente Editar(@RequestBody Cliente c) {
        return acao.save(c);
    }

}
