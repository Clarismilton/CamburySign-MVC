package br.cambury.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.cambury.bean.Professor;
import br.cambury.controle.ProfessorBCI;
import br.cambury.dao.ProfessorDaoI;

@Controller
public class ProfessorBC implements ProfessorBCI {
	@Autowired
	ProfessorDaoI dao;
	
	public void insert(Professor c){
		dao.save(c);
	}
	
	public void update(Professor c){
		dao.save(c);
	}
	
	public void delete(Professor c){
		dao.delete(c);
	}
	
	public List<Professor> select(){
		return dao.findAll();
	}

}
