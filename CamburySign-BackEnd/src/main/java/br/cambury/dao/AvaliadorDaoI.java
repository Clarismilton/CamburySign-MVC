package br.cambury.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.cambury.bean.Avaliador;

public interface AvaliadorDaoI extends JpaRepository<Avaliador, Long> {
	
	public Avaliador findById(Integer id);
	
}