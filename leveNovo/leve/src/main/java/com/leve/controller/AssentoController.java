package com.leve.controller;

import com.leve.DTO.AssentoDTO;
import com.leve.model.entities.Assento;
import com.leve.model.service.AssentoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/api/assento")
@AllArgsConstructor
public class AssentoController {
    AssentoService assentoService;

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody @Valid AssentoDTO assentoDTO) {
        Assento assento = new Assento();
        BeanUtils.copyProperties(assentoDTO, assento);
        return ResponseEntity.status(HttpStatus.CREATED).body(assentoService.save(assento));
    }

    @GetMapping
    public ResponseEntity<Object> findAll() {
        return ResponseEntity.status(HttpStatus.FOUND).body(assentoService.findAll());
    }

    @GetMapping("/{codigoAssento}")
    public ResponseEntity<Object> findById(@PathVariable(value = "codigoAssento") Integer codigoAssento) {
        Optional<Assento> assentoOptional= assentoService.findById(codigoAssento);
        if(assentoOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.FOUND).body(assentoService.findById(codigoAssento));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ERRO! Não existe um assento com este código.");
    }

    @DeleteMapping("/{codigoAssento}")
    public ResponseEntity<Object> deleteById(@PathVariable(value = "codigoAssento") Integer codigoAssento) {
        assentoService.deleteById(codigoAssento);
        return ResponseEntity.status(HttpStatus.OK).body("DELETADO.");
    }

    public boolean existsById(Integer integer) {
        return assentoService.existsById(integer);
    }

}

