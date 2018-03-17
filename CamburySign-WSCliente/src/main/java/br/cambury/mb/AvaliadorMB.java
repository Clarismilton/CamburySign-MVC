package br.cambury.mb;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.cambury.bean.Avaliador;
import br.cambury.controle.AvaliadorBC;

@ManagedBean(name = "AvaliadorMB")
public class AvaliadorMB {

	private Avaliador bean;
	private List<Avaliador> avaliador;
	
	
	public AvaliadorMB() {
		this.bean = new Avaliador();
		this.avaliador = new ArrayList<Avaliador>();
	}
	
		public void consultar() {
		AvaliadorBC cws = new AvaliadorBC();
		this.avaliador = cws.select();
		
	}
	
	public void cadastrar() {
		AvaliadorBC cws = new AvaliadorBC();
		cws.cadastrarAvaliador(this.bean);
		
	}

	public Avaliador getBean() {
		return bean;
	}

	public void setBean(Avaliador bean) {
		this.bean = bean;
	}

	public List<Avaliador> getAvaliador() {
		return avaliador;
	}

	public void setAvaliador(List<Avaliador> avaliador) {
		this.avaliador = avaliador;
	}
	
}
