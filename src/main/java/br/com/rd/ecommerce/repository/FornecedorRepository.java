package br.com.rd.ecommerce.repository;

import br.com.rd.ecommerce.model.entity.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
    List<Fornecedor> findByRazaoSocial(String razaoSocial);
    List<Fornecedor> findByNomeFantasia(String nomeFantasia);
    List<Fornecedor> findByCnpj(String cnpj);
}
