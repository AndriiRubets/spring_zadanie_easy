package com.javagda21.spring_zadanie_easy.repository;

import com.javagda21.spring_zadanie_easy.modele.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note,Long> {
}
