package br.com.sg.treinee.projeto1.endpoints;

import br.com.sg.treinee.projeto1.models.Animal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "animal")
public class AnimalEndpoint {

    @GetMapping
    public ResponseEntity listAll() {
        return ResponseEntity.ok(new Animal("Kiko","Pão"));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity getByID(@PathVariable Long id) {
        return ResponseEntity.ok(new Animal("Urso","Mel"));
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Animal animal) {
        return ResponseEntity.ok(animal);
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
