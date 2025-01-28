package com.otavio.narutodb.service;

import com.otavio.narutodb.model.Personagem;
import com.otavio.narutodb.repository.PersonagemRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PersonagemServiceTest {

    @Mock
    private PersonagemRepository personagemRepository;

    @InjectMocks
    private PersonagemService personagemService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void salvarPersonagem() {
        Personagem personagem = new Personagem("Sasuke", 14, "Konoha");
        when(personagemRepository.save(personagem)).thenReturn(personagem);

        Personagem result = personagemService.salvarPersonagem(personagem);

        assertNotNull(result);
        assertEquals("Sasuke", result.getNome());
        verify(personagemRepository, times(1)).save(personagem);
    }

    @Test
    void buscarPersonagemPorId() {
        Personagem personagem = new Personagem("Sasuke", 14, "Konoha");
        personagem.setId(1L);

        when(personagemRepository.findById(1L)).thenReturn(Optional.of(personagem));

        Optional<Personagem> result = personagemService.buscarPersonagemPorId(1L);

        assertTrue(result.isPresent());
        assertEquals("Sasuke", result.get().getNome());
        verify(personagemRepository, times(1)).findById(1L);
    }
}
