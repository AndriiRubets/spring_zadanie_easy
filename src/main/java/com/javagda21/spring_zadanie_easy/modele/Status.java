package com.javagda21.spring_zadanie_easy.modele;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "status", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    private List<ChecklistItem> checklistItems;
}
