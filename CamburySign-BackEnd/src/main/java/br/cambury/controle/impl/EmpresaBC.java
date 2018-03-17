package br.cambury.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.cambury.bean.Empresa;
import br.cambury.controle.EmpresaBCI;
import br.cambury.dao.EmpresaDaoI;

@Controller
public class EmpresaBC implements EmpresaBCI {

	@Autowired
	private EmpresaDaoI dao;
	
	public void insert(Empresa c){
		dao.save(c);
	}
	
	public void update(Empresa c){
		dao.save(c);
	}
	
	public void delete(Empresa c){
		dao.delete(c);
	}
	
	public List<Empresa> select(){
		return dao.findAll();
	}

}
