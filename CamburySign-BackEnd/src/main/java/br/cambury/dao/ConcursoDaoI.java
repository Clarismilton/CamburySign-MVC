package br.cambury.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.cambury.bean.Concurso;

public interface ConcursoDaoI extends JpaRepository<Concurso, Long>  {}
