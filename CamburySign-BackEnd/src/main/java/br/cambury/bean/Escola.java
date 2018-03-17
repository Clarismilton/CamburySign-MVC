package br.cambury.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_escola", sequenceName = "escola_seq", initialValue = 1, allocationSize = 1)
public class Escola {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_escola")
	private Integer id;
	
	private String nome;
	private String chefe;
	
	@OneToMany(targetEntity = Curso.class, mappedBy = "escola")
	private List<Curso> cursos;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getChefe() {
		return chefe;
	}
	public void setChefe(String chefe) {
		this.chefe = chefe;
	}

}
