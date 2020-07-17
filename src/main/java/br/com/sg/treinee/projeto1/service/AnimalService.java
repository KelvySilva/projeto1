package br.com.sg.treinee.projeto1.service;

import br.com.sg.treinee.projeto1.domain.Animal;
import br.com.sg.treinee.projeto1.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository repository;

    public Optional<Animal> findOne(Long id) {
        return this.repository.findById(id);
    }

    public List<Animal> list() {
        return this.repository.findAll();
    }

    @Transactional
    public Animal saveOne(Animal animal){
        this.repository.save(animal);
        return animal;
    }

}
