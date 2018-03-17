package br.cambury.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.cambury.bean.Curso;

public interface CursoDaoI extends JpaRepository<Curso, Long> {}
