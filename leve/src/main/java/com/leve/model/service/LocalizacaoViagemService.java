package com.leve.model.service;

import com.leve.model.entities.LocalizacaoViagem;
import com.leve.repository.LocalizacaoViagemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class LocalizacaoViagemService {
    private LocalizacaoViagemRepository localizacaoViagemRepository;

    public List<LocalizacaoViagem> findAll() {
        return localizacaoViagemRepository.findAll();
    }

    public <S extends LocalizacaoViagem> S save(S entity) {
        return localizacaoViagemRepository.save(entity);
    }

    public Optional<LocalizacaoViagem> findById(Integer integer) {
        return localizacaoViagemRepository.findById(integer);
    }
}
