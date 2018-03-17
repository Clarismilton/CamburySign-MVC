package br.cambury.view.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.cambury.bean.Concurso;
import br.cambury.controle.ConcursoBCI;
import br.cambury.controle.impl.ConcursoBC;

@ManagedBean(name = "ConcursoMB")
@ViewScoped
public class ConcursoMB extends SpringBeanAutowiringSupport {	
	
	private Concurso bean;
	private Concurso alterar;
	@Autowired
	private ConcursoBCI controle;
	private List<Concurso> list;
	private Boolean exibirBtnAlterar;
		
	/*
	 * este m�todo init tem uma nota��o PostConstruct
	 * isso faz com que o m�todo rode automaticamente ap�s o construtor ser chamado
	 * */

	@PostConstruct
	public void init(){
		this.bean = new Concurso();
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

	public Concurso getAlterar() {
		return alterar;
	}

	public void setAlterar(Concurso alterar) {
		this.alterar = alterar;
	}

	public Concurso getBean() {
		return bean;
	}

	public void setBean(Concurso bean) {
		this.bean = bean;
	}

	public List<Concurso> getList() {
		return list;
	}

	public void setList(List<Concurso> list) {
		this.list = list;
	}
	
	public void gravar(){
		this.controle.insert(this.bean);
		this.init();
		FacesContext context = 
				FacesContext.getCurrentInstance();
        
        context.addMessage(null,
        		new FacesMessage("Sucesso",  
        				"O Concurso foi cadastrado!" ) );
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
        				"O Concurso foi atualizado!" ) );
	}
	
	public void excluir(){
		this.controle.delete(this.bean);
		this.init();
		FacesContext context = 
				FacesContext.getCurrentInstance();
        
        context.addMessage(null,
        		new FacesMessage("Sucesso",  
        				"O Concurso foi Excluido!" ) );
	}
	
	public void preparaUpdate(){
		this.bean = this.alterar;
		this.exibirBtnAlterar = true;
	}
}
