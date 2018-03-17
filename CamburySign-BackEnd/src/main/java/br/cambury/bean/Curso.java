package br.cambury.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_curso", sequenceName = "curso_seq", initialValue = 1, allocationSize = 1)
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_curso")
	private Integer id;
	private String nome;
	private String chefe;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_escola")
	private Escola escola;
	
	@ManyToMany( fetch = FetchType.EAGER)
	@JoinTable(name = "curso_aluno", joinColumns = { @JoinColumn(name = "fk_curso") }, inverseJoinColumns = {@JoinColumn(name = "fk_aluno") })
	private List<Aluno> alunos;
	
	@OneToMany(targetEntity = Disciplina.class, mappedBy = "curso")
	private List<Disciplina> materias;
	
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
