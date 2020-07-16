package br.com.sg.treinee.projeto1.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    @NotNull
    @NotEmpty
    private String nomeItem;

    @NotNull
    @NotEmpty
    private BigDecimal valorItem;

}
