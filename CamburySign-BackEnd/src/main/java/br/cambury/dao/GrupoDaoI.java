package br.cambury.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.cambury.bean.Grupo;

public interface GrupoDaoI extends JpaRepository<Grupo, Long>  {}