package br.com.celsoaquino.curso.services;

import br.com.celsoaquino.curso.domain.Cliente;
import br.com.celsoaquino.curso.repositories.ClienteRepository;
import br.com.celsoaquino.curso.services.exceptions.ObjectNotFoundExcepion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente buscar(Integer id){
        Optional<Cliente> obj = clienteRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundExcepion(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }
}
