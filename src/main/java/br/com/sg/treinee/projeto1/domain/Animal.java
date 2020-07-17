package br.com.sg.treinee.projeto1.domain;

import lombok.*;

import javax.persistence.Entity;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Animal extends AbtractEntity{

    private String nome;
    private String comidaFavorita;

}
