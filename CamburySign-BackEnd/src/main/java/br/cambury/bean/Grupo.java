package br.cambury.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_grupo", sequenceName = "grupo_seq", initialValue = 1, allocationSize = 1)
public class Grupo {

	@Id
	@GeneratedValue(strategy = 
	GenerationType.SEQUENCE, generator = "seq_grupo")	
	private Integer id;
	private String nome;
	private String gerente;
	private String stand; 			// 2x2 - 2x4 - 4x4
	private Boolean stand_pago; 	// Sim ou N�o
	private String periodo; 		// de 1 a 12
	private String pre_projeto;
	private String projeto_final;
	private String tipo_pca; 		// 1-Pr�tica Cambury - 2-Feira Gastron�mica
	private Integer id_empresa;		// FK
	private Integer id_curso;		// FK
	private Integer id_professor;	// FK
	private Integer id_concurso;	// FK
	
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
	public String getGerente() {
		return gerente;
	}
	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
	public String getStand() {
		return stand;
	}
	public void setStand(String stand) {
		this.stand = stand;
	}
	public Boolean getStand_pago() {
		return stand_pago;
	}
	public void setStand_pago(Boolean stand_pago) {
		this.stand_pago = stand_pago;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getPre_projeto() {
		return pre_projeto;
	}
	public void setPre_projeto(String pre_projeto) {
		this.pre_projeto = pre_projeto;
	}
	public String getProjeto_final() {
		return projeto_final;
	}
	public void setProjeto_final(String projeto_final) {
		this.projeto_final = projeto_final;
	}
	public String getTipo_pca() {
		return tipo_pca;
	}
	public void setTipo_pca(String tipo_pca) {
		this.tipo_pca = tipo_pca;
	}
	public Integer getId_empresa() {
		return id_empresa;
	}
	public void setId_empresa(Integer id_empresa) {
		this.id_empresa = id_empresa;
	}
	public Integer getId_curso() {
		return id_curso;
	}
	public void setId_curso(Integer id_curso) {
		this.id_curso = id_curso;
	}
	public Integer getId_professor() {
		return id_professor;
	}
	public void setId_professor(Integer id_professor) {
		this.id_professor = id_professor;
	}
	public Integer getId_concurso() {
		return id_concurso;
	}
	public void setId_concurso(Integer id_concurso) {
		this.id_concurso = id_concurso;
	}
	
}
