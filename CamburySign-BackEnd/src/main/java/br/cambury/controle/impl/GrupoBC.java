package br.cambury.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.cambury.bean.Grupo;
import br.cambury.controle.GrupoBCI;
import br.cambury.dao.GrupoDaoI;

@Controller
public class GrupoBC implements GrupoBCI {

	@Autowired
	private GrupoDaoI dao;
	
	public void insert(Grupo c){
		dao.save(c);
	}
	
	public void update(Grupo c){
		dao.save(c);
	}
	
	public void delete(Grupo c){
		dao.delete(c);
	}
	
	public List<Grupo> select(){
		return dao.findAll();
	}

}
