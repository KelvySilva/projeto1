package br.com.sg.treinee.projeto1.endpoints;

import br.com.sg.treinee.projeto1.models.Cep;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "cep")
public class CepEndpoint {

    @GetMapping(path = "/{cep}")
    public ResponseEntity findOne(@PathVariable String cep) {
        RestTemplate restTemplate = new RestTemplate();
        Cep object = restTemplate.getForObject("https://viacep.com.br/ws/{cep}/json", Cep.class,cep);
        return ResponseEntity.ok(object);
    }

}
