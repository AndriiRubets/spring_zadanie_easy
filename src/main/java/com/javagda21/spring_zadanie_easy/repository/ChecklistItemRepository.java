package com.javagda21.spring_zadanie_easy.repository;

import com.javagda21.spring_zadanie_easy.modele.ChecklistItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChecklistItemRepository extends JpaRepository<ChecklistItem,Long> {
}
