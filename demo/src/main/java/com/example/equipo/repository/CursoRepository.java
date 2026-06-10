package com.example.equipo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.equipo.entity.Cursos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CursoRepository extends JpaRepository<Cursos, Integer> {
    Page<Cursos> findByActivoTrue(Pageable pageable);
}
