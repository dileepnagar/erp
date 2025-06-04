package com.dileep.erp.controller;

import com.dileep.erp.model.GradeSection;
import com.dileep.erp.repository.GradeSectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/grades")
@CrossOrigin("http://localhost:5173")
public class GradeSectionController {

    @Autowired
    private GradeSectionRepository repo;

    @GetMapping
    public List<GradeSection> getAll() {
        return repo.findAll();
    }
}
