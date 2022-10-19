package com.leve.DTO;

import lombok.Getter;

import javax.persistence.Column;

@Getter
public class ClienteDTO {
    private String cpf;
    private String nomeCompleto;
    private String dataNascimento;
    private String codigoPassaporte;
}
