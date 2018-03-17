package br.cambury.controle;

import java.util.List;

import br.cambury.bean.Professor;

public interface ProfessorBCI {

	public void insert(Professor c);
	
	public void update(Professor c);
	
	public void delete(Professor c);
	
	public List<Professor> select();
	
}