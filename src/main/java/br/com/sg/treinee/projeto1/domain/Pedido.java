package br.com.sg.treinee.projeto1.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Pedido {

    @NotNull
    @NotEmpty
    private Long numeroPedido;

    private Date dataPedido;

    private List<Item> items;

    @NotNull
    @NotEmpty
    private BigDecimal valorTotal;

    @NotNull
    @NotEmpty
    private Cliente cliente;

    public Pedido() {
        this.valorTotal = BigDecimal.ZERO;
        this.dataPedido = new Date();
    }
}
