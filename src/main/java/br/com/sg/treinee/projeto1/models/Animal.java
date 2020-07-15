package br.com.sg.treinee.projeto1.models;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Animal {

    private String nome;
    private String comidaFavorita;

}
