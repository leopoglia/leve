package com.leve.repository;

import com.leve.model.entities.LocalizacaoViagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalizacaoViagemRepository extends JpaRepository<LocalizacaoViagem, Integer> {
}
