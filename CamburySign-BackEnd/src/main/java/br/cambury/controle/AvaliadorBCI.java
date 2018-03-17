package br.cambury.controle;

import java.util.List;

import br.cambury.bean.Avaliador;

public interface AvaliadorBCI {

	public void insert(Avaliador c);
	
	public void update(Avaliador c);
	
	public void delete(Avaliador c);
	
	public List<Avaliador> select();
	
	public Avaliador select(Integer id);
	
}