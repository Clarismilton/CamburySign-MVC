package br.cambury.controle;

import java.util.List;

import br.cambury.bean.Empresa;

public interface EmpresaBCI {

	public void insert(Empresa c);
	
	public void update(Empresa c);
	
	public void delete(Empresa c);
	
	public List<Empresa> select();
	
}