package com.leve.model.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "assento")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Assento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Integer codigoAssento;

    @Column(nullable = false)
    private Boolean ocupado;
}


