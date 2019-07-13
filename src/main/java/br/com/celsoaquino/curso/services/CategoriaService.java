package br.com.celsoaquino.curso.services;

import br.com.celsoaquino.curso.domain.Categoria;
import br.com.celsoaquino.curso.repositories.CategoriaRepository;
import br.com.celsoaquino.curso.services.exceptions.DataIntegrityException;
import br.com.celsoaquino.curso.services.exceptions.ObjectNotFoundExcepion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria find(Integer id){
       Optional<Categoria> obj = categoriaRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundExcepion(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }

    public Categoria insert(Categoria obj){
        obj.setId(null);
        return categoriaRepository.save(obj);
    }

    public Categoria update(Categoria obj) {
        find(obj.getId());
        return categoriaRepository.save(obj);
    }

    public void delete(Integer id){
        find(id);
        try{
       categoriaRepository.deleteById(id);
        }catch (DataIntegrityViolationException e){
            throw new DataIntegrityException("Não é possivel excluir categoria que tem produtos");
        }
    }

}
