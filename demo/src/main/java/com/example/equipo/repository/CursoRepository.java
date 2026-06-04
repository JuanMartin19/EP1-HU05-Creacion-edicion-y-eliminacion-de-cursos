package com.example.equipo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.equipo.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
