package br.com.rd.ecommerce.controller;

import br.com.rd.ecommerce.model.entity.Produto;
import br.com.rd.ecommerce.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping("/produto")
    public Produto saveProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @GetMapping("/produto/list")
    public List<Produto> findProduto() {
        return produtoRepository.findAll();
    }

    @GetMapping("/produto/{idProduto}")
    public Produto findByIdAlt(@PathVariable("idProduto") Long idProduto) {
        return produtoRepository.findById(idProduto).get();
    }

//    @GetMapping("/produto")
//    public Produto findById(@PathParam("id") Long idProduto) {
//        return produtoRepository.findById(idProduto).get();
//    }

    @GetMapping("/produto/{descricao}")
    public List<Produto> findByDescricao(@PathVariable("descricao") String descricao) {
        return produtoRepository.findByDescricao(descricao);
    }
//
//    @GetMapping("/produto")
//    public ResponseEntity<Produto> buscarPorId(@PathParam("id") Long id, @PathParam("descricao") String descricao) {
//        if (id != null && descricao != null)
//            return ResponseEntity.ok().body(produtoRepository.findByIdProdutoAndDescricao(id, descricao).get(0));
//        else if (id != null)
//            return ResponseEntity.ok().body(produtoRepository.findById(id).get());
//        else if (descricao != null)
//            return ResponseEntity.ok().body(produtoRepository.findByDescricao(descricao).get(0));
//        else
//            return ResponseEntity.badRequest().build();
//    }

    @GetMapping("/produto")
    public ResponseEntity<List<Produto>> buscarPorId(@PathParam("id") Long id, @PathParam("descricao") String descricao) {
        List<Produto> produto = new ArrayList<>();

        if (id != null && descricao != null)
            produto = produtoRepository.findByIdProdutoAndDescricao(id, descricao);
        else if (id != null)
            produto.add(produtoRepository.findById(id).get());
        else if (descricao != null)
            produto = produtoRepository.findByDescricao(descricao);

        if (produto != null && produto.size() > 0)
            return ResponseEntity.ok().body(produto);
        else
            return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/produto/{id}")
    public void deleteById(@PathVariable("id") Long idProduto) {
        produtoRepository.deleteById(idProduto);
    }

    @PutMapping("/produto")
    public ResponseEntity<Produto> alterarProduto(@RequestBody Produto produto) {
        Produto produtoEntity = produtoRepository.getOne(produto.getIdProduto());
        produtoEntity.setDescricao(produto.getDescricao());
        produtoEntity.setFabricante(produto.getFabricante());
        produtoEntity.setCategoria(produto.getCategoria());
        produtoEntity.setCor(produto.getCor());
        produtoEntity.setValor(produto.getValor());
        produtoEntity.setFornecedorIdForn(produto.getFornecedorIdForn());
        return ResponseEntity.ok().body(produtoRepository.save(produtoEntity));
    }
}
