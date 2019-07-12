package br.com.celsoaquino.curso.repositories;

import br.com.celsoaquino.curso.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
