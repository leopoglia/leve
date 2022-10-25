package com.leve.model.service;

import com.leve.model.entities.Assento;
import com.leve.repository.AssentoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AssentoService {
    private AssentoRepository assentoRepository;

    public <S extends Assento> S save(S entity) {
        return assentoRepository.save(entity);
    }

    public Optional<Assento> findById(Integer integer) {
        return assentoRepository.findById(integer);
    }

    public void deleteById(Integer integer) {
        assentoRepository.deleteById(integer);
    }

    public List<Assento> findAll() {
        return assentoRepository.findAll();
    }

    public boolean existsById(Integer integer) {
        return assentoRepository.existsById(integer);
    }
}
