package com.leve.DTO;

import com.leve.model.entities.Localizacao;
import com.leve.model.entities.Viagem;
import lombok.Getter;

@Getter
public class LocalizacaoViagemDTO {
    private Integer codigo;
    private Viagem viagem;
    private Localizacao localizacao;
}
