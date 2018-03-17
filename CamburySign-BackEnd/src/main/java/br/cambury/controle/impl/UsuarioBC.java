package br.cambury.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.cambury.bean.Usuario;
import br.cambury.controle.UsuarioBCI;
import br.cambury.dao.UsuarioDaoI;
@Controller
public class UsuarioBC implements UsuarioBCI{

	@Autowired
	UsuarioDaoI dao ;
	
	public void insert(Usuario c){
		dao.save(c);
	}
	
	public void update(Usuario c){
		dao.save(c);
	}
	
	public void delete(Usuario c){
		dao.delete(c);
	}
	
	public List<Usuario> select(){
		return dao.findAll();
	}

}
