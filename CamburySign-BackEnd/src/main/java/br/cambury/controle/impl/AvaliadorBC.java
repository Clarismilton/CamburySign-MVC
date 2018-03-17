package br.cambury.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.cambury.bean.Avaliador;
import br.cambury.controle.AvaliadorBCI;
import br.cambury.dao.AvaliadorDaoI;

@Controller
public class AvaliadorBC implements AvaliadorBCI {

	@Autowired
	AvaliadorDaoI dao;
	
	public void insert(Avaliador c){
		dao.save(c);
	}
	
	public void update(Avaliador c){
		dao.save(c);
	}
	
	public void delete(Avaliador c){
		dao.delete(c);
	}
	
	@Override
	public List<Avaliador> select(){
		return dao.findAll();
	}

	@Override
	public Avaliador select(Integer id) {
		return dao.findById(id);
	}

}
