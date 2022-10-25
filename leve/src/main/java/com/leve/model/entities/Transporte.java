package com.leve.model.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @ToString
@Table(name = "transporte")
@EqualsAndHashCode
@Entity
public class Transporte {
    @Id
    @Column(length = 8, unique = true, nullable = false)
    private String identificador;
    @Column(nullable = false)
    private Integer numeroAssentos;
    @OneToMany
    @JoinColumn(name = "codigo_Assentos")
    private List<Assento> assentos;
}
