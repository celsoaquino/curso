package br.com.celsoaquino.curso.services;

import br.com.celsoaquino.curso.domain.Pedido;
import br.com.celsoaquino.curso.repositories.PedidoRepository;
import br.com.celsoaquino.curso.services.exceptions.ObjectNotFoundExcepion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService  {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido buscar(Integer id){
        Optional<Pedido> obj = pedidoRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundExcepion(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }
}
