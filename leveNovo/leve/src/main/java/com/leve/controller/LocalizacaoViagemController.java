package com.leve.controller;

import com.leve.DTO.LocalizacaoViagemDTO;
import com.leve.model.entities.LocalizacaoViagem;
import com.leve.model.service.LocalizacaoViagemService;
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
@RequestMapping("/api/localizacaoviagem")
public class LocalizacaoViagemController {
    private LocalizacaoViagemService localizacaoViagemService;

    @GetMapping
    public ResponseEntity<List<LocalizacaoViagem>> findAll() {
        return ResponseEntity.status(HttpStatus.FOUND).body(localizacaoViagemService.findAll());
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody @Valid LocalizacaoViagemDTO localizacaoViagemDTO) {
        LocalizacaoViagem localizacaoViagem = new LocalizacaoViagem();
        BeanUtils.copyProperties(localizacaoViagemDTO, localizacaoViagem);
        return ResponseEntity.status(HttpStatus.FOUND).body(localizacaoViagemService.save(localizacaoViagem));
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Object> findById(@PathVariable(value = "codigo") Integer integer) {
        return ResponseEntity.status(HttpStatus.FOUND).body(localizacaoViagemService.findById(integer));
    }
}
