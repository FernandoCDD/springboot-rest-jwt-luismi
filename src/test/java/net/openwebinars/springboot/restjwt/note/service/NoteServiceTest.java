package net.openwebinars.springboot.restjwt.note.service;

import net.openwebinars.springboot.restjwt.dto.NotesGroupedByTagsDto;
import net.openwebinars.springboot.restjwt.note.model.Note;
import net.openwebinars.springboot.restjwt.note.repo.NoteRepository;
import net.openwebinars.springboot.restjwt.user.model.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class NoteServiceTest {

    @Mock
    NoteRepository noteRepository;

    @InjectMocks
    NoteService noteService;

    @Test
    void notesGroupedByTagsDtoList() {

        User u1 = User.builder()
                .id(UUID.randomUUID())
                .build();

        Note n1 = Note.builder()
                .id(1L)
                .title("Nota 1")
                .content("Contenido 1")
                .author(u1.getId().toString())
                .important(false)
                .tags(List.of("Nota1", "Nota2"))
                .build();

        Note n2 = Note.builder()
                .id(2L)
                .title("Nota 2")
                .content("Contenido 2")
                .author(u1.getId().toString())
                .important(false)
                .tags(List.of("Nota3", "Nota4"))
                .build();

        Note n3 = Note.builder()
                .id(3L)
                .title("Nota 3")
                .content("Contenido 3")
                .author(u1.getId().toString())
                .important(false)
                .tags(List.of("Nota5", "Nota6"))
                .build();

        List<Note> notas = new ArrayList<>();

        notas.addAll(List.of(n1,n2,n3));

        //Esto te devuelve las listas de arriba, sería como guardarlas en el repositorio,
        //pero en vez de eso estas haciendo un doble de este y guardando unicamente
        //los valores que has creado, y con ellos ya trabajas.
        Mockito.when(noteRepository.findByAuthor(u1.getId().toString())).thenReturn(notas);

        List<NotesGroupedByTagsDto> notasEsperadas = noteService.notesGroupedByTagsDtoList(u1.getId().toString());

        assertEquals(notasEsperadas.size(), 6);
    }
}