package br.com.sg.treinee.projeto1.resource;

import br.com.sg.treinee.projeto1.domain.Cep;
import br.com.sg.treinee.projeto1.domain.Pedido;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@RestController
@RequestMapping(path = "orders")
public class PedidoAPI {

    @PostMapping
    public ResponseEntity save(@RequestBody Pedido pedido) {
        if (pedido.getCliente().getCep().equals("") || pedido.getCliente().getCep().length() < 8) {
            return ResponseEntity.badRequest().build();
        }
        try {
            RestTemplate restTemplate = new RestTemplate();
            Cep object = restTemplate.getForObject("https://viacep.com.br/ws/{cep}/json", Cep.class,pedido.getCliente().getCep());
        }catch (Exception e) {
            return ResponseEntity.ok("Não foi possivel processar o cep informado");
        }


        pedido.setValorTotal(
                pedido.getItems()
                .stream().map(p -> p.getValorItem().multiply(new BigDecimal(p.getQuantidade())))
                .reduce(BigDecimal.ZERO, BigDecimal::add));


        return ResponseEntity.ok(pedido);
    }

}
