package br.com.sg.treinee.projeto1.endpoints;

import br.com.sg.treinee.projeto1.models.Pedido;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "orders")
public class PeidoEndpoint {

    @PostMapping
    public ResponseEntity save(@RequestBody Pedido pedido) {
        return ResponseEntity.ok(pedido);
    }

}
