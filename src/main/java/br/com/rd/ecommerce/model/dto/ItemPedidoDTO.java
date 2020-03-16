package br.com.rd.ecommerce.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemPedidoDTO {

    private Long idItemCarrinho;
    private Integer produtoId;
    private Integer carrinhoVenda;
    private Integer qtdProduto;
    private BigDecimal valorProduto;
}
