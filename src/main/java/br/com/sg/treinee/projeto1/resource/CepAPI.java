package br.com.sg.treinee.projeto1.resource;

import br.com.sg.treinee.projeto1.domain.Cep;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "cep")
public class CepAPI {

    @GetMapping(path = "/{cep}")
    public ResponseEntity findOne(@PathVariable String cep) {
        RestTemplate restTemplate = new RestTemplate();
        Cep object = restTemplate.getForObject("https://viacep.com.br/ws/{cep}/json", Cep.class,cep);
        return ResponseEntity.ok(object);
    }

}
