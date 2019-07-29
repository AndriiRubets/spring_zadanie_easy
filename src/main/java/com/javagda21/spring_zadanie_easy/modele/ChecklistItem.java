package com.javagda21.spring_zadanie_easy.modele;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ChecklistItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private LocalDateTime dateCompleted;


    @ManyToOne
    private Status status;
    @ManyToOne
    private Checklist checklist;

    @OneToMany(mappedBy = "checklistItem", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    private List<Note> notes;
}
