package com.example.msvc.cursos.msvc_cursos.services;

import java.util.Optional;

import com.example.msvc.cursos.msvc_cursos.models.entity.Curso;

import java.util.List;

public interface CursoService {

    List<Curso> listar();
    Optional<Curso> porId(Long id);
    Curso guardar(Curso curso);
    void eliminar(Long id);
}
