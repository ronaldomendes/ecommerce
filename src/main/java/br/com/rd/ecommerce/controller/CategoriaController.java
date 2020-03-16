package br.com.rd.ecommerce.controller;

import br.com.rd.ecommerce.model.entity.Categoria;
import br.com.rd.ecommerce.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;
//    private CategoriaRepository categoriaRepository;

    @PostMapping("/categoria")
    public ResponseEntity salvarCategoria (@RequestBody Categoria categoria) {
        return ResponseEntity.ok().body(categoriaService.salvarCategoria(categoria));
    }
//    public Categoria saveCategoria(@RequestBody Categoria categoria){
//        return categoriaRepository.save(categoria);
//    }

    @GetMapping("/categoria/list")
    public ResponseEntity listarCategorias (@RequestBody Categoria categoria) {
        return ResponseEntity.ok().body(categoriaService.listarCategorias());
    }
//    public List<Categoria> findCategoria() {
//        return categoriaRepository.findAll();
//    }

//    @GetMapping("/categoria/{idCategoria}")
//    public Categoria findById(@PathVariable("idCategoria") Long idCategoria){
//        return categoriaRepository.findById(idCategoria).get();
//    }

//    @GetMapping("/categoria")
//    public Categoria findCategoriaById(@PathParam("id") Long idCategoria) {
//        return categoriaRepository.findById(idCategoria).get();
//    }

//    @DeleteMapping("/categoria/{id}")
//    public void deleteById(@PathVariable("id") Long idCategoria) {
//        categoriaRepository.deleteById(idCategoria);
//    }

//    @PutMapping("/categoria")
//    public ResponseEntity<Categoria> alterarCategoria(@RequestBody Categoria categoria) {
//        Categoria categoriaEntity = categoriaRepository.getOne(categoria.getIdCategoria());
//        categoriaEntity.setDescricao(categoria.getDescricao());
//        return ResponseEntity.ok().body(categoriaRepository.save(categoriaEntity));
//    }

//    @PatchMapping("/categoria")
//    public ResponseEntity<Categoria> alterarCamposEspecificos(@RequestBody Categoria categoria) {
//        Categoria categoriaEntity = categoriaRepository.getOne(categoria.getIdCategoria());
//        categoriaEntity.setDescricao(categoria.getDescricao());
//        return ResponseEntity.ok().body(categoriaRepository.save(categoriaEntity));
//    }
}
