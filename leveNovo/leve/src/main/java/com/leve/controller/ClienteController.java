package com.leve.controller;

import com.leve.DTO.ClienteDTO;
import com.leve.model.entities.Cliente;
import com.leve.model.service.ClienteService;
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
@RequestMapping("/api/cliente")
public class ClienteController {
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll() {
        return ResponseEntity.status(HttpStatus.FOUND).body(clienteService.findAll());
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody @Valid ClienteDTO clienteDTO) {
        if(clienteService.existsById(clienteDTO.getCpf())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Erro! Já existe um cliente com este cpf!");
        }

        Cliente cliente = new Cliente();
        BeanUtils.copyProperties(clienteDTO, cliente);
        return  ResponseEntity.status(HttpStatus.CREATED).body(clienteService.save(cliente));
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<Object> findById(@PathVariable(value = "cpf") String cpf) {
        Optional<Cliente> clienteOptional = clienteService.findById(cpf);
        if(clienteOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(clienteService.findById(cpf));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Erro! Nenhum cliente com este cpf!");
    }

    @DeleteMapping("/{cpf}")
    public ResponseEntity<Object> deleteById(@PathVariable(value = "cpf") String cpf) {
        Optional<Cliente> clienteOptional = clienteService.findById(cpf);
        if(clienteOptional.isPresent()){
            clienteService.deleteById(cpf);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente deletado com sucesso!");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Erro! Nenhum cliente com este cpf!");
    }
}
