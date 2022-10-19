package com.leve.model.service;

import com.leve.model.entities.Cliente;
import com.leve.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ClienteService {
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public <S extends Cliente> S save(S entity) {
        return clienteRepository.save(entity);
    }

    public Optional<Cliente> findById(String s) {
        return clienteRepository.findById(s);
    }

    public boolean existsById(String s) {
        return clienteRepository.existsById(s);
    }

    public void deleteById(String s) {
        clienteRepository.deleteById(s);
    }
}
