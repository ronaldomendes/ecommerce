package br.com.rd.ecommerce.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_fornecedor")
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFornecedor;
    @Column(nullable = false, name = "ds_razao_social")
    private String razaoSocial;
    @Column(nullable = false, name = "ds_nome_fantasia")
    private String nomeFantasia;
    @Column(nullable = false, name = "nr_cnpj")
    private String cnpj;
    @Column(nullable = false, name = "nr_insc_estadual")
    private String inscEstadual;
}
