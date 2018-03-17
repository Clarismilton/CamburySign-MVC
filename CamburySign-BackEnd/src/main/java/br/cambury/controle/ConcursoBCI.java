package br.cambury.controle;

import java.util.List;

import br.cambury.bean.Concurso;

public interface ConcursoBCI {

	public void insert(Concurso c);
	
	public void update(Concurso c);
	
	public void delete(Concurso c);
	
	public List<Concurso> select();
	
}
