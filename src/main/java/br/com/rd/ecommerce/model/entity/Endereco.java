package br.com.rd.ecommerce.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEndereco;
    @Column(nullable = false, name = "nr_telefone")
    private String numTelefone;
    @Column(nullable = false, name = "nr_cep")
    private String cep;
    @Column(nullable = false, name = "ds_logradouro")
    private String logradouro;
    @Column(nullable = false, name = "nr_numero")
    private String numero;
    @Column(nullable = false, name = "ds_complemento")
    private String complemento;
    @Column(nullable = false, name = "ds_referencia")
    private String referencia;
    @Column(nullable = false, name = "ds_bairro")
    private String bairro;
    @Column(nullable = false, name = "ds_cidade")
    private String cidade;
    @Column(nullable = false, name = "ds_uf")
    private String uf;
    @Column(name = "nr_cliente_id")
    private Integer clienteId;
    @Column(name = "nr_fornecedor_id")
    private Integer fornecedorId;
}
