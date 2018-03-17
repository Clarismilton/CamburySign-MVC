package br.cambury.bean;

import java.util.Date;

public class Avaliador {
	
	private Integer id;
	private String nome;
	private String profissao;
	private String telefone1;
	private String telefone2;
	private String email;
	private Date nascimento;
	private Integer id_curso; // FK

	public Avaliador() {
		
	}
	
	public Avaliador(Integer id) {
		this.id = id;
	}
	
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
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}
	public String getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public Integer getId_curso() {
		return id_curso;
	}
	public void setId_curso(Integer id_curso) {
		this.id_curso = id_curso;
	}

}
