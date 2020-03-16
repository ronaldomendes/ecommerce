package br.com.rd.ecommerce.model.dto;

import br.com.rd.ecommerce.model.entity.ItemPedido;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidoDTO {

    private Integer idPedido;
    private Date dtPedido;
    private Integer cliente;
    private Integer valorFrete;
    private String dsFormaPagto;
    private BigDecimal valorPedido;

    List<ItemPedidoDTO> itemPedidoDTO;

}
