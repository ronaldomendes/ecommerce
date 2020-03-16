package br.com.rd.ecommerce.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_item_pedido")
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idItemCarrinho;
    @Column(name = "produto_id")
    private Integer produtoId;
    @Column(name = "carrinho_venda")
    private Integer carrinhoVenda;
    @Column(name = "qtd_produto")
    private Integer qtdProduto;
    @Column(name = "vl_produto")
    private BigDecimal valorProduto;

    @ManyToOne
    @JoinColumn(name = "idPedido")
    private Pedido pedido;
}
