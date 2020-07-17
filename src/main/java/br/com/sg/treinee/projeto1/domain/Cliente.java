package br.com.sg.treinee.projeto1.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cliente extends AbtractEntity {

    @NotNull
    @NotEmpty
    private String nome;

    @NotNull
    @NotEmpty
    private String cep;
}
