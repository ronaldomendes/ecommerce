package br.com.rd.ecommerce.repository;

import br.com.rd.ecommerce.model.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> { }
