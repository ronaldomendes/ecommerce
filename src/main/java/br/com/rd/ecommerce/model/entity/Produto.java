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
@Table(name = "tb_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduto;
    @Column(nullable = false, name = "ds_descricao")
    private String descricao;
    @Column(nullable = false, name = "ds_fabricante")
    private String fabricante;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @Column(nullable = false, name = "ds_cor")
    private String cor;
    @Column(nullable = false, name = "nr_valor")
    private BigDecimal valor;
    @Column(nullable = false, name = "nr_fornecedor_id")
    private Integer fornecedorIdForn;
}
