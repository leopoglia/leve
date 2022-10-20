package com.leve.controller;

import com.leve.DTO.TransporteDTO;
import com.leve.model.entities.Transporte;
import com.leve.model.service.TransporteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
@RequestMapping("/api/transporte")
public class TransporteController {
    private TransporteService transporteService;

    @GetMapping
    public ResponseEntity<List<Transporte>> findAll() {
        return ResponseEntity.status(HttpStatus.FOUND).body(transporteService.findAll());
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody @Valid TransporteDTO transporteDTO) {
        if(transporteService.existsById(transporteDTO.getIdentificador())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Erro! Já existe um transporte com este identificador!");
        }
        Transporte transporte = new Transporte();
        BeanUtils.copyProperties(transporteDTO, transporte);
        return ResponseEntity.status(HttpStatus.CREATED).body(transporteService.save(transporte));
    }

    @GetMapping("/{identificador}")
    public ResponseEntity<Object> findById(@PathVariable(value = "identificador") String identificador) {
        Optional<Transporte> transporteOptional = transporteService.findById(identificador);
        if(transporteOptional.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Erro! Nenhum transporte com este identificador");
        }
        return ResponseEntity.status(HttpStatus.OK).body(transporteService.findById(identificador));
    }

    @DeleteMapping("/{identificador}")
    public ResponseEntity<Object> deleteById(@PathVariable(value = "identificador") String identificador) {
        Optional<Transporte> transporteOptional = transporteService.findById(identificador);
        if(transporteOptional.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Erro! Nenhum transporte com este identificador");
        }
        transporteService.deleteById(identificador);
        return ResponseEntity.status(HttpStatus.FOUND).body("Transporte deletado com sucesso!");
    }

    @PutMapping("/{identificador}")
    public ResponseEntity<Object> update(@RequestBody @Valid TransporteDTO transporteDTO) {
        if(transporteService.existsById(transporteDTO.getIdentificador())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Erro! Já existe um transporte com este identificador!");
        }
        Transporte transporte = new Transporte();
        BeanUtils.copyProperties(transporteDTO, transporte);
        return ResponseEntity.status(HttpStatus.CREATED).body(transporteService.save(transporte));
    }
}
