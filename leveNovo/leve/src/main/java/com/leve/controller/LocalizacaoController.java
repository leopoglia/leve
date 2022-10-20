package com.leve.controller;

import com.leve.DTO.LocalizacaoDTO;
import com.leve.model.entities.Localizacao;
import com.leve.model.service.LocalizacaoService;
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
@RequestMapping("/api/localizacao")
@AllArgsConstructor
public class LocalizacaoController {
    LocalizacaoService localizacaoService;

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody @Valid LocalizacaoDTO localizacaoDTO) {
        Localizacao localizacao = new Localizacao();
        BeanUtils.copyProperties(localizacaoDTO, localizacao);
        return ResponseEntity.status(HttpStatus.CREATED).body(localizacaoService.save(localizacao));
    }

    @GetMapping
    public ResponseEntity<List<Localizacao>> findAll() {
        return ResponseEntity.status(HttpStatus.FOUND).body(localizacaoService.findAll());
    }

    @GetMapping("/{codigoLocalizacao}")
    public ResponseEntity<Object> findById(@PathVariable(value = "codigoLocalizacao") Integer codigoLocalizacao) {
        Optional<Localizacao> localizacaoOptional= localizacaoService.findById(codigoLocalizacao);
        if(localizacaoOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.FOUND).body(localizacaoService.findById(codigoLocalizacao));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ERRO! Não existe uma localização com este código.");
    }

    @DeleteMapping("/{codigoLocalizacao}")
    public ResponseEntity<Object> deleteById(@PathVariable(value = "codigoLocalizacao") Integer codigoLocalizacao) {
        localizacaoService.deleteById(codigoLocalizacao);
        return ResponseEntity.status(HttpStatus.OK).body("DELETADO.");
    }

}
