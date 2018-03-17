package br.cambury.controle;

import java.util.List;

import br.cambury.bean.Curso;

public interface CursoBCI {

	public void insert(Curso c);
	
	public void update(Curso c);
	
	public void delete(Curso c);
	
	public List<Curso> select();
	
}
