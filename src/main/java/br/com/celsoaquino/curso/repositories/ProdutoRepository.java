package br.com.celsoaquino.curso.repositories;

import br.com.celsoaquino.curso.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
