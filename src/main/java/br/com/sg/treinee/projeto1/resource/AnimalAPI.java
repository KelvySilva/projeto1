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


    private final AnimalService service;

    @Autowired
    public AnimalAPI(AnimalService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity listAll() {
        return ResponseEntity.ok(this.service.list());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity listOne(@PathVariable Long id) {
        Optional<Animal> optionalAnimal = this.service.findOne(id);
        if (optionalAnimal.isPresent()) {
            return ResponseEntity.ok(optionalAnimal.get());
        }else {
            return ResponseEntity.ok("Not Found");
        }
    }

    @PostMapping
    public ResponseEntity saveOne(@RequestBody Animal animal) {
        return ResponseEntity.ok(this.service.saveOne(animal));
    }

    @PutMapping
    public ResponseEntity updateOne(@PathVariable Long id,@RequestBody Animal animal) {
        animal.setId(id);
        return ResponseEntity.ok(this.service.updateOne(animal));
    }

    @DeleteMapping
    public ResponseEntity removeOne(@RequestBody Long id) {
        this.service.removeOne(id);
        return ResponseEntity.ok("Removed Successfully");
    }
}
