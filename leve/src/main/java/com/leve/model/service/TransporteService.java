package com.leve.model.service;

import com.leve.model.entities.Transporte;
import com.leve.repository.TransporteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class TransporteService {
    private TransporteRepository transporteRepository;

    public List<Transporte> findAll() {
        return transporteRepository.findAll();
    }

    public <S extends Transporte> S save(S entity) {
        return transporteRepository.save(entity);
    }

    public Optional<Transporte> findById(String s) {
        return transporteRepository.findById(s);
    }

    public boolean existsById(String s) {
        return transporteRepository.existsById(s);
    }

    public void deleteById(String s) {
        transporteRepository.deleteById(s);
    }
}
