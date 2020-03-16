package br.com.rd.ecommerce.controller;

import br.com.rd.ecommerce.model.dto.PedidoDTO;
import br.com.rd.ecommerce.model.entity.Pedido;
import br.com.rd.ecommerce.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;
//    private PedidoRepository pedidoRepository;

    @PostMapping("/pedido")
    public ResponseEntity savePedido(@RequestBody PedidoDTO pedido) {
        return ResponseEntity.ok().body(pedidoService.salvarPedido(pedido));
    }

//    @GetMapping("/pedido/list")
//    public List<Pedido> findPedido() {
//        return pedidoRepository.findAll();
//    }
}
