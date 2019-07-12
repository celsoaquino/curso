package br.com.celsoaquino.curso.repositories;

import br.com.celsoaquino.curso.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
