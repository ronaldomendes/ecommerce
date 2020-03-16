package br.com.rd.ecommerce.controller;

import br.com.rd.ecommerce.model.entity.ItemPedido;
import br.com.rd.ecommerce.repository.ItemPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemPedidoController {

    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create-item-pedido")
    public ItemPedido saveItemPedido(@RequestBody ItemPedido itemPedido) {
        return itemPedidoRepository.save(itemPedido);
    }

    @GetMapping("/find-item-pedido/list")
    public List<ItemPedido> findItemPedido() {
        return itemPedidoRepository.findAll();
    }
}
