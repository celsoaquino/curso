package br.com.celsoaquino.curso.repositories;

import br.com.celsoaquino.curso.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
}
