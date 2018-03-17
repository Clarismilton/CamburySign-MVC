package br.cambury.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_empresa", sequenceName = "empresa_seq", initialValue = 1, allocationSize = 1)
public class Empresa {
	
	@Id
	@GeneratedValue(strategy = 
	GenerationType.SEQUENCE, generator = "seq_empresa")	
	private Integer id;
	private String fantasia;
	private String razao_social;
	private String cnpj;
	private String contato1;
	private String contato2;
	private String telefone1;
	private String telefone2;
	private String email;
	private String rua;
	private String numero;
	private String bairro;
	private String cep;
	private String cidade;
	private String uf;
	private String complemento;
	private Integer id_curso1; //FK
	private Integer id_curso2; //FK
	private Integer id_curso3; //FK

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFantasia() {
		return fantasia;
	}
	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}
	public String getRazao_social() {
		return razao_social;
	}
	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getContato1() {
		return contato1;
	}
	public void setContato1(String contato1) {
		this.contato1 = contato1;
	}
	public String getContato2() {
		return contato2;
	}
	public void setContato2(String contato2) {
		this.contato2 = contato2;
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
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public Integer getId_curso1() {
		return id_curso1;
	}
	public void setId_curso1(Integer id_curso1) {
		this.id_curso1 = id_curso1;
	}
	public Integer getId_curso2() {
		return id_curso2;
	}
	public void setId_curso2(Integer id_curso2) {
		this.id_curso2 = id_curso2;
	}
	public Integer getId_curso3() {
		return id_curso3;
	}
	public void setId_curso3(Integer id_curso3) {
		this.id_curso3 = id_curso3;
	}
	
}
