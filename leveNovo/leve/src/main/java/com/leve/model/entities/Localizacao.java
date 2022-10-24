package com.leve.model.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "localizacao")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Localizacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Integer codigoLocalizacao;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private String localizacao;

}
