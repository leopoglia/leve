package com.leve.DTO;

import com.leve.model.entities.Assento;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
public class TransporteDTO {
    private String identificador;
    private Integer numeroAssentos;
    private List<Assento> assento;
}
