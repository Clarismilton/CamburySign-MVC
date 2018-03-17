package br.cambury.controle;

import java.util.List;

import br.cambury.bean.Usuario;

public interface UsuarioBCI {

	public void insert(Usuario c);
	
	public void update(Usuario c);
	
	public void delete(Usuario c);
	
	public List<Usuario> select();
	
}