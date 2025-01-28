package com.otavio.narutodb.service;

import com.otavio.narutodb.model.Personagem;
import com.otavio.narutodb.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonagemService {

    @Autowired
    private PersonagemRepository personagemRepository;

    public Personagem salvarPersonagem(Personagem personagem) {
        return personagemRepository.save(personagem);
    }

    public List<Personagem> buscarTodosPersonagens() {
        return personagemRepository.findAll();
    }

    public Optional<Personagem> buscarPersonagemPorId(Long id) {
        return personagemRepository.findById(id);
    }

    public void deletarPersonagem(Long id) {
        personagemRepository.deleteById(id);
    }

    public Personagem atualizarPersonagem(Long id, Personagem personagemAtualizado) {
        if (personagemRepository.existsById(id)) {
            personagemAtualizado.setId(id);
            return personagemRepository.save(personagemAtualizado);
        } else {
            return null;
        }
    }
}
