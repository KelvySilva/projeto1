package br.com.sg.treinee.projeto1.resource;

import br.com.sg.treinee.projeto1.domain.Cliente;
import br.com.sg.treinee.projeto1.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "cliente")
public class ClienteAPI {


    private final ClienteService service;

    @Autowired
    public ClienteAPI(ClienteService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity listAll() {
        return ResponseEntity.ok(this.service.list());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity listOne(@PathVariable Long id) {
        return ResponseEntity.ok(this.service.findOne(id));
    }

    @PostMapping
    public ResponseEntity saveOne(@RequestBody Cliente cliente) {
        this.service.save(cliente);
        return ResponseEntity.ok(cliente);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity updateOne(@PathVariable Long id, @RequestBody Cliente cliente){
        cliente.setId(id);
        this.service.update(cliente);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping
    public ResponseEntity removeOne(@PathVariable Long id) {
        this.service.remove(id);
        return ResponseEntity.ok("Removed Successfully");
    }
}
