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

    @OneToOne
    @JoinColumn(name = "codigoLocalizacaoEmbarque")
    private Localizacao localEmbarque;

    @OneToOne
    @JoinColumn(name = "codigoLocalizacaoDesembarque")
    private Localizacao localDesembarque;

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

    @OneToOne
    @JoinColumn(name = "codigo_Transporte")
    private Transporte transporte;

}
