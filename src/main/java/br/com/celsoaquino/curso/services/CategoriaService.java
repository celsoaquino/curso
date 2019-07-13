package br.com.celsoaquino.curso.services;

import br.com.celsoaquino.curso.domain.Categoria;
import br.com.celsoaquino.curso.repositories.CategoriaRepository;
import br.com.celsoaquino.curso.services.exceptions.ObjectNotFoundExcepion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria buscar(Integer id){
       Optional<Categoria> obj = categoriaRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundExcepion(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }

    public Categoria insert(Categoria obj){
        //obj.setId(null);
        return categoriaRepository.save(obj);
    }

}
