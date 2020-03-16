package br.com.rd.ecommerce.controller;

import br.com.rd.ecommerce.model.entity.Nf;
import br.com.rd.ecommerce.repository.NfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NfController {

    @Autowired
    private NfRepository nfRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("create/nf")
    public Nf saveNf(@RequestBody Nf nf) {
        return nfRepository.save(nf);
    }

    @GetMapping("find-nf/list")
    public List<Nf> findNf() {
        return nfRepository.findAll();
    }
}
