package br.com.celsoaquino.curso.repositories;

import br.com.celsoaquino.curso.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
