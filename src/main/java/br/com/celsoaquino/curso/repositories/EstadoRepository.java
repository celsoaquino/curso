package br.com.celsoaquino.curso.repositories;

import br.com.celsoaquino.curso.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
