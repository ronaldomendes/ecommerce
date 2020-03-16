package br.com.rd.ecommerce.controller;

import br.com.rd.ecommerce.model.entity.Fornecedor;
import br.com.rd.ecommerce.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FornecedorController {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create-fornecedor")
    public Fornecedor saveFornecedor(@RequestBody Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    @GetMapping("find-fornecedor/list")
    public List<Fornecedor> findFornecedor() {
        return fornecedorRepository.findAll();
    }
}
