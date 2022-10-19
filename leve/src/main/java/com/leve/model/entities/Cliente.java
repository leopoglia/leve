package com.leve.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
public class Cliente {
    @Id
    @Column(length = 11, unique = true)
    private String cpf;
    private String nome;
    private String dataNascimento;
    private Integer numeroPassaporte;
}
