package br.com.rd.ecommerce.repository;

import br.com.rd.ecommerce.model.entity.Nf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NfRepository extends JpaRepository<Nf, Long> {
    List<Nf> findByNumNf(Integer numNf);
}
