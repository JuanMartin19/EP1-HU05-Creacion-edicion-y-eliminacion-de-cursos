package com.example.equipo.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.equipo.entity.Curso;
import com.example.equipo.repository.CursoRepository;

@Service
public class CursoService {

    private final CursoRepository repo;

    public CursoService(CursoRepository repo) {
        this.repo = repo;
    }

    public List<Curso> findAll() {
        return repo.findAll();
    }

    public Curso findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Curso save(Curso c) {
        return repo.save(c);
    }

    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
