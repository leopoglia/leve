package com.leve.model.entities;

import lombok.*;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "viagem")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Viagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Integer codigoViagem;

    @Column(nullable = false)
    private Integer localEmbarque;

    @Column(nullable = false)
    private Integer localDesembarque;

    @OneToMany
    @JoinColumn(name = "codigo_Parada")
    private List<Localizacao> paradas;

    @Column(nullable = false)
    private Date dataSaida;

    @Column(nullable = false)
    private Date dataChegada;

    @Column(nullable = false)
    private String horaSaida;

    @Column(nullable = false)
    private String horaChegada;

    @Column(nullable = false)
    private Double valor;

}
