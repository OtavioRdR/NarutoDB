package com.otavio.narutodb.repository;

import com.otavio.narutodb.model.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonagemRepository extends JpaRepository<Personagem, Long> {
}
