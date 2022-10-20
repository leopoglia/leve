package com.leve.model.service;

import com.leve.model.entities.Viagem;
import com.leve.repository.ViagemRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ViagemService {
    ViagemRepository viagemRepository;

    public List<Viagem> findAll() {
        return viagemRepository.findAll();
    }

    public <S extends Viagem> S save(S entity) {
        return viagemRepository.save(entity);
    }

    public Optional<Viagem> findById(Integer integer) {
        return viagemRepository.findById(integer);
    }

    public <S extends Viagem> boolean exists(Example<S> example) {
        return viagemRepository.exists(example);
    }

    public void deleteById(Integer integer) {
        viagemRepository.deleteById(integer);
    }

    public boolean existsById(Integer codigoViagem) {
        return viagemRepository.existsById(codigoViagem);

    }
}
