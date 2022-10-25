package com.leve.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "localizacao_viagem")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class LocalizacaoViagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer codigo;

    @ManyToOne
    @JoinColumn(name = "codigo_Viagem")
    private Viagem viagem;

    @ManyToOne
    @JoinColumn(name = "codigo_Localizacao")
    private Localizacao localizacao;

}
