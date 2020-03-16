package br.com.rd.ecommerce.controller;

import br.com.rd.ecommerce.model.entity.Cliente;
import br.com.rd.ecommerce.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create-cliente")
    public Cliente saveCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @GetMapping("/find-cliente/list")
    public List<Cliente> findCliente() {
        return clienteRepository.findAll();
    }
}
