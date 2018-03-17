package br.cambury.controle.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.cambury.bean.Curso;
import br.cambury.controle.CursoBCI;
import br.cambury.dao.CursoDaoI;

@Controller
public class CursoBC implements CursoBCI{
	
	@Autowired
	private CursoDaoI dao;
	
	public void insert(Curso c){
		dao.save(c);
	}
	
	public void update(Curso c){
		dao.save(c);
	}
	
	public void delete(Curso c){
		dao.delete(c);
	}
	
	public List<Curso> select(){
		return dao.findAll();
	}
}
