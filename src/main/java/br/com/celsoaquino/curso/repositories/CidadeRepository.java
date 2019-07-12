package br.com.celsoaquino.curso.repositories;

import br.com.celsoaquino.curso.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
