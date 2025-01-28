package com.otavio.narutodb.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.otavio.narutodb.model.Personagem;
import com.otavio.narutodb.service.PersonagemService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(PersonagemController.class)
public class PersonagemControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PersonagemService personagemService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testSalvarPersonagem() throws Exception {
        Personagem personagem = new Personagem("Naruto", 17, "Aldeia da Folha");
        when(personagemService.salvarPersonagem(Mockito.any(Personagem.class))).thenReturn(personagem);

        mockMvc.perform(post("/personagens")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(personagem)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nome").value("Naruto"))
                .andExpect(jsonPath("$.idade").value(17));
    }

    @Test
    public void testBuscarTodosPersonagens() throws Exception {
        when(personagemService.buscarTodosPersonagens()).thenReturn(
                Arrays.asList(
                        new Personagem("Naruto", 17, "Aldeia da Folha"),
                        new Personagem("Sasuke", 18, "Aldeia da Folha")
                )
        );

        mockMvc.perform(get("/personagens"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(2))
                .andExpect(jsonPath("$[0].nome").value("Naruto"));
    }

    @Test
    public void testBuscarPersonagemPorId() throws Exception {
        Personagem personagem = new Personagem("Naruto", 17, "Aldeia da Folha");
        when(personagemService.buscarPersonagemPorId(1L)).thenReturn(Optional.of(personagem));

        mockMvc.perform(get("/personagens/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nome").value("Naruto"))
                .andExpect(jsonPath("$.idade").value(17));
    }

    @Test
    public void testDeletarPersonagem() throws Exception {
        doNothing().when(personagemService).deletarPersonagem(1L);

        mockMvc.perform(delete("/personagens/1"))
                .andExpect(status().isOk());

        verify(personagemService, times(1)).deletarPersonagem(1L);
    }
}
