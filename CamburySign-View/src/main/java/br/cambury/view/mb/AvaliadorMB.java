package br.cambury.view.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.cambury.bean.Avaliador;
import br.cambury.controle.AvaliadorBCI;
import br.cambury.controle.impl.AvaliadorBC;

@ManagedBean(name = "AvaliadorMB")
@ViewScoped
public class AvaliadorMB extends SpringBeanAutowiringSupport {	
	
	private Avaliador bean;
	private Avaliador alterar;
	@Autowired
	private AvaliadorBCI controle;
	private List<Avaliador> list;
	private Boolean exibirBtnAlterar;
		
	/*
	 * este m�todo init tem uma nota��o PostConstruct
	 * isso faz com que o m�todo rode automaticamente ap�s o construtor ser chamado
	 * */

	@PostConstruct
	public void init(){
		this.bean = new Avaliador();
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

	public Avaliador getAlterar() {
		return alterar;
	}

	public void setAlterar(Avaliador alterar) {
		this.alterar = alterar;
	}

	public Avaliador getBean() {
		return bean;
	}

	public void setBean(Avaliador bean) {
		this.bean = bean;
	}

	public List<Avaliador> getList() {
		return list;
	}

	public void setList(List<Avaliador> list) {
		this.list = list;
	}
	
	public void gravar(){
		this.controle.insert(this.bean);
		this.init();
		FacesContext context = 
				FacesContext.getCurrentInstance();
        
        context.addMessage(null,
        		new FacesMessage("Sucesso",  
        				"O Avaliador foi cadastrado!" ) );
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
        				"O Avaliador foi atualizado!" ) );
	}
	
	public void excluir(){
		this.controle.delete(this.bean);
		this.init();
		FacesContext context = 
				FacesContext.getCurrentInstance();
        
        context.addMessage(null,
        		new FacesMessage("Sucesso",  
        				"O Avaliador foi Excluido!" ) );
	}
	
	public void preparaUpdate(){
		this.bean = this.alterar;
		this.exibirBtnAlterar = true;
	}
}