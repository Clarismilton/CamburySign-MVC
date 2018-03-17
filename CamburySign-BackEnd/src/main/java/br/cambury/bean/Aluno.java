package br.cambury.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_aluno", sequenceName = "aluno_seq", initialValue = 1, allocationSize = 1)
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_aluno")
	private Integer id;
	private String nome;
	private String cpf;
	
	@ManyToMany(mappedBy = "alunos")
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
