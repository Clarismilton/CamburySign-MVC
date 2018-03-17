package br.cambury.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_concurso", sequenceName = "concurso_seq", initialValue = 1, allocationSize = 1)
public class Concurso {

	@Id
	@GeneratedValue(strategy = 
	GenerationType.SEQUENCE, generator = "seq_concurso")
	private Integer id;
	private String anosemestre;
	private String evento;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAnosemestre() {
		return anosemestre;
	}
	public void setAnosemestre(String anosemestre) {
		this.anosemestre = anosemestre;
	}
	public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}

}
