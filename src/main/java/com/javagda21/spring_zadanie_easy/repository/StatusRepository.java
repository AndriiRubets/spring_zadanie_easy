package com.javagda21.spring_zadanie_easy.repository;

import com.javagda21.spring_zadanie_easy.modele.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status,Long> {
}
