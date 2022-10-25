package com.leve.controller;

import com.leve.DTO.ViagemDTO;
import com.leve.model.entities.Viagem;
import com.leve.model.service.ViagemService;
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
@RequestMapping("/api/viagem")
@AllArgsConstructor
public class ViagemController {
    ViagemService viagemService;

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody @Valid ViagemDTO viagemDTO) {
        Viagem viagem = new Viagem();

        System.out.println(viagemDTO.getLocalDesembarque());
        System.out.println(viagemDTO.getLocalEmbarque());

        BeanUtils.copyProperties(viagemDTO, viagem);

        return ResponseEntity.status(HttpStatus.CREATED).body(viagemService.save(viagem));
    }

    @GetMapping
    public ResponseEntity<List<Viagem>> findAll() {
        return ResponseEntity.status(HttpStatus.FOUND).body(viagemService.findAll());
    }

    @GetMapping("/{codigoViagem}")
    public ResponseEntity<Object> findById(@PathVariable @Valid Integer codigoViagem) {
        Optional<Viagem> viagemOptional = viagemService.findById(codigoViagem);
        if (viagemOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.FOUND).body(viagemService.findById(codigoViagem));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ERRO! Não foi possível encontrar essa viagem.");
    }

    @DeleteMapping("{codigoViagem}")
    public ResponseEntity<Object> deleteById(@PathVariable(value = "codigoViagem") Integer codigoViagem) {
        viagemService.deleteById(codigoViagem);
        return ResponseEntity.status(HttpStatus.OK).body("VIAGEM DELETADA.");
    }

    @PutMapping
    public ResponseEntity<Object> update(@RequestBody @Valid ViagemDTO viagemDTO) {
        if (!viagemService.existsById(viagemDTO.getCodigoViagem())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("ERRO! Essa viagem não existe.");
        }

        Viagem viagem = viagemService.findById(viagemDTO.getCodigoViagem()).get();
        BeanUtils.copyProperties(viagemDTO, viagem);
        return ResponseEntity.status(HttpStatus.CREATED).body(viagemService.save(viagem));
    }
}
