package com.leve.repository;

import com.leve.model.entities.Viagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViagemRepository extends JpaRepository<Viagem, Integer> {
}
