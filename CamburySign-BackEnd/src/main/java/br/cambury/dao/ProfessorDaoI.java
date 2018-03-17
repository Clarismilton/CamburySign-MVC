package br.cambury.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.cambury.bean.Professor;

public interface ProfessorDaoI extends JpaRepository<Professor, Long> {
	
	//public List<Professor> findBayIdcursoLassThan(Integer n); // Exemplo de consulta
	
}