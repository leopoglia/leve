package com.leve.model.service;

import com.leve.model.entities.Localizacao;
import com.leve.repository.LocalizacaoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class LocalizacaoService {
    private LocalizacaoRepository localizacaoRepository;

    public List<Localizacao> findAll() {
        return localizacaoRepository.findAll();
    }

    public <S extends Localizacao> S save(S entity) {
        return localizacaoRepository.save(entity);
    }

    public Optional<Localizacao> findById(Integer integer) {
        return localizacaoRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return localizacaoRepository.existsById(integer);
    }

    public void deleteById(Integer integer) {
        localizacaoRepository.deleteById(integer);
    }
}
