package br.com.rd.ecommerce.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_nf")
public class Nf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNf;
    @Column(nullable = false, name = "nr_id_fornecedor")
    private Integer fornecedorIdForn;
    @Column(nullable = false, name = "nr_id_cliente")
    private Integer clienteIdCliente;
    @Column(nullable = false, name = "nr_nf")
    private Integer numNf;
    @Column(nullable = false, name = "dt_emissao")
    private Date dataEmissao;
}
