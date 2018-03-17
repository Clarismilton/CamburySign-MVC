package br.cambury.view.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.cambury.bean.Usuario;
import br.cambury.controle.UsuarioBCI;
import br.cambury.controle.impl.UsuarioBC;

@ManagedBean(name = "UsuarioMB")
@ViewScoped
public class UsuarioMB extends SpringBeanAutowiringSupport {	
	
	private Usuario bean;
	private Usuario alterar;
	@Autowired
	private UsuarioBCI controle;
	private List<Usuario> list;
	private Boolean exibirBtnAlterar;
		
	/*
	 * este m�todo init tem uma nota��o PostConstruct
	 * isso faz com que o m�todo rode automaticamente ap�s o construtor ser chamado
	 * */

	@PostConstruct
	public void init(){
		this.bean = new Usuario();
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

	public Usuario getAlterar() {
		return alterar;
	}

	public void setAlterar(Usuario alterar) {
		this.alterar = alterar;
	}

	public Usuario getBean() {
		return bean;
	}

	public void setBean(Usuario bean) {
		this.bean = bean;
	}

	public List<Usuario> getList() {
		return list;
	}

	public void setList(List<Usuario> list) {
		this.list = list;
	}
	
	public void gravar(){
		this.controle.insert(this.bean);
		this.init();
		FacesContext context = 
				FacesContext.getCurrentInstance();
        
        context.addMessage(null,
        		new FacesMessage("Sucesso",  
        				"O Usuario foi cadastrado!" ) );
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
        				"O Usuario foi atualizado!" ) );
	}
	
	public void excluir(){
		this.controle.delete(this.bean);
		this.init();
		FacesContext context = 
				FacesContext.getCurrentInstance();
        
        context.addMessage(null,
        		new FacesMessage("Sucesso",  
        				"O Usuario foi Excluido!" ) );
	}
	
	public void preparaUpdate(){
		this.bean = this.alterar;
		this.exibirBtnAlterar = true;
	}
}