package com.leve.DTO;

import com.leve.model.entities.Localizacao;
import lombok.Getter;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Getter
public class ViagemDTO {
    private Integer codigoViagem;
    private Integer localEmbarque;
    private Integer localDesembarque;
    private List<Localizacao> paradas;
    private Date dataSaida;
    private Date dataChegada;
    private String horaSaida;
    private String horaChegada;
    private double valor;
}
