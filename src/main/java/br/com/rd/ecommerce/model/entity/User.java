package br.com.rd.ecommerce.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, name = "ds_first_name")
    private String firstName;
    @Column(nullable = false, name = "ds_last_name")
    private String lastName;
    @Column(nullable = false, name = "nr_age")
    private Integer age;
}
