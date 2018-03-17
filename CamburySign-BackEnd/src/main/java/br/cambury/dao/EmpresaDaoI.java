package br.cambury.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.cambury.bean.Empresa;

public interface EmpresaDaoI extends JpaRepository<Empresa, Long> {}