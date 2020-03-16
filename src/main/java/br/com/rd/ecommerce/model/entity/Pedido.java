package br.com.rd.ecommerce.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPedido;
    @Column(name = "dt_pedido")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtPedido;

    @Column(name = "dt_atualizacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAtualizacao;

    @Column(name = "id_cliente")
    private Integer cliente;
    @Column(name = "vl_frete")
    private Integer valorFrete;
    @Column(name = "ds_forma_pagto")
    private String dsFormaPagto;
    @Column(name = "vl_pedido")
    private BigDecimal valorPedido;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idItemCarrinho")
    List<ItemPedido> itensPedido;
}
