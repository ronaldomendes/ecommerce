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
@Table(name = "tb_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;
    @Column(nullable = false, name = "ds_nome")
    private String nome;
    @Column(nullable = false, name = "nr_cpf")
    private String cpf;
    @Column(nullable = false, name = "ds_email")
    private String email;
    @Column(nullable = false, name = "ds_senha")
    private String senha;
    @Column(nullable = false, name = "ds_data")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataNasc;
    @Column(nullable = false, name = "ds_genero")
    private Character genero;
}
