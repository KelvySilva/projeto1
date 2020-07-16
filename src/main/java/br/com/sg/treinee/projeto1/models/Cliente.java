package br.com.sg.treinee.projeto1.models;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @NotNull
    @NotEmpty
    private String nome;

    @NotNull
    @NotEmpty
    private Long Cpf;

    @NotNull
    @NotEmpty
    private String endereco;

    @NotNull
    @NotEmpty
    private String cep;
}
