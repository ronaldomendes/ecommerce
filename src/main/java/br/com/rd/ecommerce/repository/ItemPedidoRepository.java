package br.com.rd.ecommerce.repository;

import br.com.rd.ecommerce.model.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
    List<ItemPedido> findByIdItemCarrinho(Long idItemCarrinho);
}
