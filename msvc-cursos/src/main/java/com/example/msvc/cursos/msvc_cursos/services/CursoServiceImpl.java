package com.example.msvc.cursos.msvc_cursos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.msvc.cursos.msvc_cursos.entity.Curso;
import com.example.msvc.cursos.msvc_cursos.repositories.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepository impl;

    @Override
    @Transactional(readOnly = true)
    public List<Curso> listar() {
        return (List<Curso>) impl.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Curso> porId(Long id) {
        return impl.findById(id);
    }

    @Override
    @Transactional
    public Curso guardar(Curso curso) {
        return impl.save(curso);
    }

    @Override
    public void eliminar(Long id) {
        impl.deleteById(id);
    }

}
