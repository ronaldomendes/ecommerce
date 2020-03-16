package br.com.rd.ecommerce.repository;

import br.com.rd.ecommerce.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNome(String nome);
    List<Cliente> findByCpf(String cpf);
    List<Cliente> findByEmail(String email);
}
