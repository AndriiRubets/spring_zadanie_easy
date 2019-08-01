package com.javagda21.spring_zadanie_easy.service;

import com.javagda21.spring_zadanie_easy.modele.Checklist;
import com.javagda21.spring_zadanie_easy.repository.ChecklistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChecklistService {
    @Autowired
    private ChecklistRepository checklistRepository;


    public void addChecklist(Checklist checklist) {
        checklistRepository.save(checklist);
    }

    public List<Checklist> getChecklists() {
        return checklistRepository.findAll();
    }

    public void remove(Long id) { //id to nie jest pozycja
        checklistRepository.deleteById(id);
    }

    public void save(Checklist checklist) { checklistRepository.save(checklist); }
}
