package br.com.rd.ecommerce.service;

import br.com.rd.ecommerce.model.dto.ItemPedidoDTO;
import br.com.rd.ecommerce.model.dto.PedidoDTO;
import br.com.rd.ecommerce.model.entity.ItemPedido;
import br.com.rd.ecommerce.model.entity.Pedido;
import br.com.rd.ecommerce.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("PedidoService")
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public ResponseEntity salvarPedido(PedidoDTO pedidoDTO) {
        //TODO incluir validações

        if (pedidoDTO == null || pedidoDTO.getCliente() == null) {
            return ResponseEntity.badRequest().body(new Exception("Cliente não informado!"));
        }

        if (pedidoDTO.getItemPedidoDTO() == null) {
            return ResponseEntity.badRequest().body(new Exception("Pedido não contem itens!"));
        }

        Pedido pedidoEntity = new Pedido();
        pedidoEntity.setDtPedido(pedidoDTO.getDtPedido());
        pedidoEntity.setCliente(pedidoDTO.getCliente());
        pedidoEntity.setValorPedido(pedidoDTO.getValorPedido());
        pedidoEntity.setValorFrete(pedidoDTO.getValorFrete());
        pedidoEntity.setDsFormaPagto(pedidoDTO.getDsFormaPagto());
        pedidoEntity.setDtAtualizacao(new Date());

        List<ItemPedido> listaItens = new ArrayList<>();

        for (ItemPedidoDTO itemPedidoDTO: pedidoDTO.getItemPedidoDTO()) {
            ItemPedido itemPedido = new ItemPedido();

            itemPedido.setValorProduto(itemPedidoDTO.getValorProduto());
            itemPedido.setQtdProduto(itemPedidoDTO.getQtdProduto());
            itemPedido.setProdutoId(itemPedidoDTO.getProdutoId());
            itemPedido.setCarrinhoVenda(itemPedidoDTO.getCarrinhoVenda());

            listaItens.add(itemPedido);
        }

        pedidoEntity.setItensPedido(listaItens);

        Pedido retornoEntity = pedidoRepository.save(pedidoEntity);

        pedidoDTO.setIdPedido(retornoEntity.getIdPedido());
        return ResponseEntity.ok().body(pedidoDTO);
    }
}
