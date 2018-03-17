package br.cambury.view.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.cambury.bean.Professor;
import br.cambury.controle.ProfessorBCI;
import br.cambury.controle.impl.ProfessorBC;

@ManagedBean(name = "ProfessorMB")
@ViewScoped
public class ProfessorMB extends SpringBeanAutowiringSupport {	
	
	private Professor bean;
	private Professor alterar;
	@Autowired
	private ProfessorBCI controle;
	private List<Professor> list;
	private Boolean exibirBtnAlterar;
		
	/*
	 * este m�todo init tem uma nota��o PostConstruct
	 * isso faz com que o m�todo rode automaticamente ap�s o construtor ser chamado
	 * */

	@PostConstruct
	public void init(){
		this.bean = new Professor();
		this.list = controle.select();
		this.alterar = null;
		this.exibirBtnAlterar = false;
	}

	public Boolean getExibirBtnAlterar() {
		return exibirBtnAlterar;
	}

	public void setExibirBtnAlterar(Boolean exibirBtnAlterar) {
		this.exibirBtnAlterar = exibirBtnAlterar;
	}

	public Professor getAlterar() {
		return alterar;
	}

	public void setAlterar(Professor alterar) {
		this.alterar = alterar;
	}

	public Professor getBean() {
		return bean;
	}

	public void setBean(Professor bean) {
		this.bean = bean;
	}

	public List<Professor> getList() {
		return list;
	}

	public void setList(List<Professor> list) {
		this.list = list;
	}
	
	public void gravar(){
		this.controle.insert(this.bean);
		this.init();
		FacesContext context = 
				FacesContext.getCurrentInstance();
        
        context.addMessage(null,
        		new FacesMessage("Sucesso",  
        				"O Professor foi cadastrado!" ) );
	}
	
	public void cancelar(){
		this.init();
	}
	
	public void atualizar(){
		this.controle.update(this.bean);
		this.init();
		FacesContext context = 
				FacesContext.getCurrentInstance();
        
        context.addMessage(null,
        		new FacesMessage("Sucesso",  
        				"O Professor foi atualizado!" ) );
	}
	
	public void excluir(){
		this.controle.delete(this.bean);
		this.init();
		FacesContext context = 
				FacesContext.getCurrentInstance();
        
        context.addMessage(null,
        		new FacesMessage("Sucesso",  
        				"O Professor foi Excluido!" ) );
	}
	
	public void preparaUpdate(){
		this.bean = this.alterar;
		this.exibirBtnAlterar = true;
	}
}