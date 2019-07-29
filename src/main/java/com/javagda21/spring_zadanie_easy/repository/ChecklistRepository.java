package com.javagda21.spring_zadanie_easy.repository;

import com.javagda21.spring_zadanie_easy.modele.Checklist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChecklistRepository extends JpaRepository<Checklist,Long> {
}
