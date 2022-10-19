package com.leve.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
@Table(name = "cliente")
@Entity
public class Cliente {
    @Id
    @Column(length = 11, unique = true, nullable = false)
    private String cpf;
    @Column(length = 100, nullable = false)
    private String nomeCompleto;
    @Column(length = 10, nullable = false)
    private String dataNascimento;
    @Column(length = 8, unique = true)
    private String codigoPassaporte;
}
