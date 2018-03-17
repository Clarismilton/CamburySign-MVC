package br.cambury.view.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.cambury.bean.Curso;
import br.cambury.controle.CursoBCI;

@ManagedBean(name = "CursoMB")
@ViewScoped
public class CursoMB extends SpringBeanAutowiringSupport {	
	
	private Curso bean;
	
	private Curso alterar;
	@Autowired
	private CursoBCI controle;
	private List<Curso> list;
	private Boolean exibirBtnAlterar;
		
	/*
	 * este m�todo init tem uma nota��o PostConstruct
	 * isso faz com que o m�todo rode automaticamente ap�s o construtor ser chamado
	 * */

	@PostConstruct
	public void init(){
		this.bean = new Curso();
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

	public Curso getAlterar() {
		return alterar;
	}

	public void setAlterar(Curso alterar) {
		this.alterar = alterar;
	}

	public Curso getBean() {
		return bean;
	}

	public void setBean(Curso bean) {
		this.bean = bean;
	}

	public List<Curso> getList() {
		return list;
	}

	public void setList(List<Curso> list) {
		this.list = list;
	}
	
	public void gravar(){
		this.controle.insert(this.bean);
		this.init();
		FacesContext context = 
				FacesContext.getCurrentInstance();
        
        context.addMessage(null,
        		new FacesMessage("Sucesso",  
        				"O Curso foi cadastrado!" ) );
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
        				"O Curso foi atualizado!" ) );
	}
	
	public void excluir(){
		this.controle.delete(this.bean);
		this.init();
		FacesContext context = 
				FacesContext.getCurrentInstance();
        
        context.addMessage(null,
        		new FacesMessage("Sucesso",  
        				"O Curso foi Excluido!" ) );
	}
	
	public void preparaUpdate(){
		this.bean = this.alterar;
		this.exibirBtnAlterar = true;
	}
	
}
