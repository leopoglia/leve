package com.leve.DTO;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Getter
public class TransporteDTO {
    private String identificador;
    private Integer numeroAssentos;
    private Integer codigoAssento;
}
