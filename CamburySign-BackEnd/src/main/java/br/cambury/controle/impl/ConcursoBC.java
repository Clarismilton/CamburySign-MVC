package br.cambury.controle.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.cambury.bean.Concurso;
import br.cambury.controle.ConcursoBCI;
import br.cambury.dao.ConcursoDaoI;

@Controller
public class ConcursoBC implements ConcursoBCI{
	
	@Autowired
	ConcursoDaoI dao;
	
	public void insert(Concurso c){
		dao.save(c);
	}
	
	public void update(Concurso c){
		dao.save(c);
	}
	
	public void delete(Concurso c){
		dao.delete(c);
	}
	
	public List<Concurso> select(){
		return dao.findAll();
	}
}