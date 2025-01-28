package com.otavio.narutodb.controller;

import com.otavio.narutodb.model.Personagem;
import com.otavio.narutodb.service.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/personagens")
public class PersonagemController {

    @Autowired
    private PersonagemService personagemService;

    @PostMapping
    public Personagem salvarPersonagem(@RequestBody Personagem personagem) {
        return personagemService.salvarPersonagem(personagem);
    }

    @GetMapping
    public List<Personagem> buscarTodosPersonagens() {
        return personagemService.buscarTodosPersonagens();
    }

    @GetMapping("/{id}")
    public Optional<Personagem> buscarPersonagemPorId(@PathVariable Long id) {
        return personagemService.buscarPersonagemPorId(id);
    }

    @PutMapping("/{id}")
    public Personagem atualizarPersonagem(@PathVariable Long id, @RequestBody Personagem personagem) {
        return personagemService.atualizarPersonagem(id, personagem);
    }

    @DeleteMapping("/{id}")
    public void deletarPersonagem(@PathVariable Long id) {
        personagemService.deletarPersonagem(id);
    }
}
