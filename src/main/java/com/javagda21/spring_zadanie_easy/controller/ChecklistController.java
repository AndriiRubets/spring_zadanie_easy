package com.javagda21.spring_zadanie_easy.controller;

import com.javagda21.spring_zadanie_easy.modele.Checklist;
import com.javagda21.spring_zadanie_easy.service.ChecklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;


@Controller
public class ChecklistController {

    @Autowired
    private ChecklistService checklistService;

    @GetMapping("/checklist/add")
    public String getChecklistForm() {
        return "checklistFormPage";
    }

    @PostMapping("/checklist/add")
    public String postChecklistForm(@RequestParam(name = "nameChecklist") String name) {
        Checklist checklist = new Checklist(null, name, null, null, false, new ArrayList<>());
        if (name.isEmpty()) {
            return "redirect:/checklist/add";
        } else {
            checklistService.addChecklist(checklist);
            return "redirect:/index";
        }
    }

    @GetMapping("/checklist/list")
    public String getChecklistList(Model model) {
        model.addAttribute("checklistList",checklistService.getChecklists());
        return "checklistListPage" ;
    }
}
