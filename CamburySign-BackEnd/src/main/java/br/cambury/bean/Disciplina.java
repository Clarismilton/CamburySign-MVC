package br.cambury.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_materia", sequenceName = "materia_seq", initialValue = 1, allocationSize = 1)
public class Disciplina {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_materia")
	private Integer id;
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "fk_curso")
	private Curso curso;
	
	@OneToOne
	@JoinColumn(name = "fk_professor")
	private Professor professor;
	
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

	
	
	
}
