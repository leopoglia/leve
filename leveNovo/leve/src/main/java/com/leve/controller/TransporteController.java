package com.leve.controller;

import com.leve.DTO.TransporteDTO;
import com.leve.model.entities.Transporte;
import com.leve.model.service.TransporteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
public class TransporteController {
    private TransporteService transporteService;

    public ResponseEntity<List<Transporte>> findAll() {
        return ResponseEntity.status(HttpStatus.FOUND).body(transporteService.findAll());
    }

    public ResponseEntity<Object> save(TransporteDTO transporteDTO) {
        if(transporteService.existsById(transporteDTO.getIdentificador())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Erro! Já existe um transporte com este identificador!");
        }
        Transporte transporte = new Transporte();
        BeanUtils.copyProperties(transporteDTO, transporte);
        return ResponseEntity.status(HttpStatus.CREATED).body(transporteService.save(transporte));
    }

    public ResponseEntity<Object> findById(String identificador) {
        return ResponseEntity.status(HttpStatus.OK).body(transporteService.findById(identificador));
    }

    public ResponseEntity<Object> deleteById(String identificador) {
        Optional<Transporte> transporteOptional = transporteService.findById(identificador);
        if(transporteOptional.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Erro! Nenhum transporte com este identificador");
        }
        transporteService.deleteById(identificador);
        return ResponseEntity.status(HttpStatus.FOUND).body("Transporte deletado com sucesso!");
    }
}
