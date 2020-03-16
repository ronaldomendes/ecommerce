package br.com.rd.ecommerce.controller;

import br.com.rd.ecommerce.model.entity.Endereco;
import br.com.rd.ecommerce.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnderecoController {
    @Autowired
    private EnderecoRepository enderecoRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create-endereco")
    public Endereco saveEndereco(@RequestBody Endereco endereco) {
        return enderecoRepository.save(endereco);
    }
}
