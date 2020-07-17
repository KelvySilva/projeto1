package br.com.sg.treinee.projeto1.resource;

import br.com.sg.treinee.projeto1.domain.Animal;
import br.com.sg.treinee.projeto1.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "animal")
public class AnimalAPI {

    @Autowired
    private AnimalService service;

    @GetMapping
    public ResponseEntity listAll() {
        return ResponseEntity.ok(this.service.list());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity getByID(@PathVariable Long id) {
        Optional<Animal> optionalAnimal = this.service.findOne(id);
        if (optionalAnimal.isPresent()) {
            return ResponseEntity.ok(optionalAnimal.get());
        }else {
            return ResponseEntity.ok("Not Found");
        }
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Animal animal) {
        return ResponseEntity.ok(this.service.saveOne(animal));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody Animal animal) {
        return ResponseEntity.ok(animal);
    }

    @DeleteMapping
    public ResponseEntity remove(@RequestBody Long id) {
        return ResponseEntity.ok(id);
    }
}
