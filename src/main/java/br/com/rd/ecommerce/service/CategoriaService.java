package br.com.rd.ecommerce.service;

import br.com.rd.ecommerce.model.entity.Categoria;
import br.com.rd.ecommerce.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CategoriaService")
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public ResponseEntity salvarCategoria (Categoria categoria) {
        return ResponseEntity.ok().body(categoriaRepository.save(categoria));
    }

    public ResponseEntity<List<Categoria>> listarCategorias() {
        return ResponseEntity.ok().body(categoriaRepository.findAll());
    }

    public ResponseEntity categoriaPorId (Categoria categoria) {
        return ResponseEntity.ok().body(categoriaRepository.findById(categoria.getIdCategoria()));
    }

    public ResponseEntity alterarCategoria (Categoria categoria) {
        Categoria categoriaEntity = categoriaRepository.getOne(categoria.getIdCategoria());
        categoriaEntity.setDescricao(categoria.getDescricao());
        return ResponseEntity.ok().body(categoriaRepository.save(categoriaEntity));
    }

    public void deletarCategoria (Categoria categoria) {
        categoriaRepository.deleteById(categoria.getIdCategoria());
    }
}
