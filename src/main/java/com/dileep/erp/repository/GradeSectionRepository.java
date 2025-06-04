package com.dileep.erp.repository;

import com.dileep.erp.model.GradeSection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GradeSectionRepository extends JpaRepository<GradeSection, Long> {
    List<GradeSection> findAll();
}
